package com.codurance;

public class StringCalculator {
    public int add(String numbers) {
        if(numbers.equals(""))
            return 0;

        int result = 0;


        final String[] splitNumbers = numbers
                .replace(" ", "")
                .replace("\n", ",")
                .split(",");

        for (String value : splitNumbers) {
            result += Integer.valueOf(value);
        }

        return  result;
    }
}
