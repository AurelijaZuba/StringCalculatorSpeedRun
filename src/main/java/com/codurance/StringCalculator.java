package com.codurance;

public class StringCalculator {
    public int add(String numbers) {
        if(numbers.equals(""))
            return 0;

        int result = 0;

        String separator = null;

        separator = extractCustomSeparator(numbers);

        if(separator != null)
            numbers = getCustomSeparatedValues(numbers);
        else
            separator = "[\\n|,]";

        final String[] splitNumbers = numbers
                .replace(" ", "")
                .split(separator);

        for (String value : splitNumbers) {
            result += Integer.valueOf(value);
        }

        return  result;
    }

    private String getCustomSeparatedValues(String numbers) {
        StringBuilder sb = new StringBuilder(numbers);
        sb.delete(0, 5);
        return sb.toString();
    }

    private String extractCustomSeparator(String numbers) {
        if(!numbers.startsWith("//"))
            return null;
        StringBuffer sb = new StringBuffer(numbers);
        return sb.substring(2,3);
    }
}
