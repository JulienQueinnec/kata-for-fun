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

    @Test
    void should_return_2_given_input_is_2_as_not_divisible_by_3_or_5_and_not_contains_3_5_or_7() {
        //Given
        int input = 2;
        String expected = "2";
        KataForFunService kataForFunService  = new KataForFunService();
        //When
        String actual = kataForFunService.convert(input);

        //Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void should_return_KataKata_given_input_is_3_as_divisible_by_3_but_5_and_contains_3_but_5_or_7() {
        //Given
        int input = 3;
        String expected = "KataKata";
        KataForFunService kataForFunService  = new KataForFunService();
        //When
        String actual = kataForFunService.convert(input);

        //Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void should_return_ForFor_given_input_is_5_as_divisible_by_5_but_3_and_contains_5_but_7_or_5() {
        //Given
        int input = 5;
        String expected = "ForFor";
        KataForFunService kataForFunService  = new KataForFunService();
        //When
        String actual = kataForFunService.convert(input);

        //Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void should_return_Kata_given_input_is_6_as_divisible_by_3_but_5_and_not_contains_3_5_or_7() {
        //Given
        int input = 6;
        String expected = "Kata";
        KataForFunService kataForFunService  = new KataForFunService();
        //When
        String actual = kataForFunService.convert(input);

        //Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }


}
