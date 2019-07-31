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

    @Test
    void return_4_when_string_is_only_4() {
        StringCalculator stringCalculator = new StringCalculator();

        int actual = stringCalculator.add("4");

        int expected = 4;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void return_3_when_string_contains_one_and_two() {
        StringCalculator stringCalculator = new StringCalculator();

        int actual = stringCalculator.add("1, 2");

        int expected = 3;
        assertThat(actual).isEqualTo(expected);
    }


}
