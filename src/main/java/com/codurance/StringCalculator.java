package com.codurance;

public class StringCalculator {
    public int add(String numbers) {
        if(numbers.equals(""))
            return 0;

        int result = 0;

        final String[] splitNumbers = numbers
                .replace(" ", "")
                .split("[\\n|,]");

        System.out.println(splitNumbers[0]);

        for (String value : splitNumbers) {
            result += Integer.valueOf(value);
        }

        return  result;
    }
}
