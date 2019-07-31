package com.codurance;

public class StringCalculator {
    private boolean usingCustomSeparator = false;

    public int add(String numbers) {
        int result = 0;

        if(numbers.equals("")) {
            return result;
        }

        String separator = getSeparator(numbers);

        if(usingCustomSeparator)
            numbers = removeCustomOperatorPrefix(numbers);

        for (String value : extractSplitNumbers(numbers, separator)) {
            result += Integer.valueOf(value);
        }

        return  result;
    }

    private String[] extractSplitNumbers(String numbers, String separator) {
        return numbers
                .replace(" ", "")
                .split(separator);
    }

    private String getSeparator(String numbers) {
        String separator = extractCustomSeparator(numbers);
        if (separator == null)
            return "[\\n|,]";

        usingCustomSeparator = true;
        return separator;
    }

    private String removeCustomOperatorPrefix(String numbers) {
        StringBuilder sb = new StringBuilder(numbers);
        int index = numbers.indexOf('\n') + 1;
        sb.delete(0, index);
        return sb.toString();
    }

    private String extractCustomSeparator(String numbers) {
        if(!numbers.startsWith("//"))
            return null;
        StringBuffer sb = new StringBuffer(numbers);
        final int indexOfNewline = numbers.indexOf('\n');
        return sb.substring(2, indexOfNewline);
    }
}
