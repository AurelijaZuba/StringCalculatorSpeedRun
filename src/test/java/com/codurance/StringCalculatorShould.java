package com.codurance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorShould {
    @ParameterizedTest
    @CsvSource({
            "'', 0",
            "'4', 4",
            "'1, 2', 3",
            "'2, 3', 5",
            "'1, 2, 3', 6",
            "'1, 2, 3, 4, 5, 6, 7, 8, 9', 45",
            "'1\n2, 3', 6",
            "'//;\n1;2', 3",
            "'//-;\n1-;2', 3",

    })
    void add_numbers(String input, int expected) {
        StringCalculator stringCalculator = new StringCalculator();

        int actual = stringCalculator.add(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void not_allow_negatives() {
        Assertions.assertThrows(NegativeNumberFound.class, () -> {
            StringCalculator stringCalculator = new StringCalculator();

            String input = "1, -2, -3";
            int actual = stringCalculator.add(input);
        });

    }
}
