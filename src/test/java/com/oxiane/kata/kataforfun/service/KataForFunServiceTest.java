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

    @Test
    void should_return_Fun_given_input_is_7_as_not_divisible_by_3_or_5_and_contains_7_but_3_or_5() {
        //Given
        int input = 7;
        String expected = "Fun";
        KataForFunService kataForFunService  = new KataForFunService();
        //When
        String actual = kataForFunService.convert(input);

        //Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void should_return_Kata_given_input_is_9_as_divisible_by_3_but_5_and_not_contains_3_5_or_7() {
        //Given
        int input = 9;
        String expected = "Kata";
        KataForFunService kataForFunService  = new KataForFunService();
        //When
        String actual = kataForFunService.convert(input);

        //Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void should_return_KataFor_given_input_is_51_as_divisible_by_3_but_5_and_contains_5_but_3_or_7() {
        //Given
        int input = 51;
        String expected = "KataFor";
        KataForFunService kataForFunService  = new KataForFunService();
        //When
        String actual = kataForFunService.convert(input);

        //Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void should_return_ForKata_given_input_is_53_as_not_divisible_by_3_or_5_and_contains_3_and_5_but_7() {
        //Given
        int input = 53;
        String expected = "ForKata";
        KataForFunService kataForFunService = new KataForFunService();
        //When
        String actual = kataForFunService.convert(input);

        //Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void should_return_KataKataKata_given_input_is_33() {
        //Given
        int input = 33;
        String expected = "KataKataKata";
        KataForFunService kataForFunService = new KataForFunService();
        //When
        String actual = kataForFunService.convert(input);

        //Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void should_return_KataFun_given_input_is_27() {
        //Given
        int input = 27;
        String expected = "KataFun";
        KataForFunService kataForFunService = new KataForFunService();
        //When
        String actual = kataForFunService.convert(input);

        //Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void should_return_KataForFor_given_input_is_15() {
        //Given
        int input = 15;
        String expected = "KataForFor";
        KataForFunService kataForFunService = new KataForFunService();
        //When
        String actual = kataForFunService.convert(input);

        //Then
        Assertions.assertThat(actual).isEqualTo(expected);
    }

}
