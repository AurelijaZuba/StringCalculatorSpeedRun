package com.codurance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorShould {

    @Test
    void return_zero_when_string_is_empty() {
        StringCalculator stringCalculator = new StringCalculator();

        int actual = stringCalculator.add("");

        int expected = 0;
        assertThat(actual).isEqualTo(expected);
    }
}
