package com.codurance;

public class StringCalculator {
    public int add(String numbers) {
        if(numbers.equals(""))
            return 0;

        int number1 = 0;
        int number2 = 0;
        final String[] splitNumbers = numbers
                .replace(" ", "")
                .split(",");

        if(splitNumbers.length >= 1){
           number1 = Integer.valueOf(splitNumbers[0]);
        }
        if(splitNumbers.length >= 2){
            number2 = Integer.valueOf(splitNumbers[1]);
        }

        return number1 + number2;
    }
}
