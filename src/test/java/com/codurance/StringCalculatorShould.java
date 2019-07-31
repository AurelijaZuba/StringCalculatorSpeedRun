package com.codurance;

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
            "'1, 2, 3', 6"
    })
    void add_numbers(String input, int expected) {
        StringCalculator stringCalculator = new StringCalculator();

        int actual = stringCalculator.add(input);

        assertThat(actual).isEqualTo(expected);
    }
}
