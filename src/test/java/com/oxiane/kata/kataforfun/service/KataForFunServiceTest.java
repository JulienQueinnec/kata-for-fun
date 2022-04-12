package com.oxiane.kata.kataforfun.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class KataForFunServiceTest {

    @Test
    void should_return_1_given_input_is_1_as_not_divisible_by_3_or_5_and_not_contains_3_5_or_7() {
        //Given
        int input = 1;
        String expected = "1";
        KataForFunService kataForFunService  = new KataForFunService();
        //When
        String actual = kataForFunService.convert(input);

        //Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

}
