package com.oxiane.kata.kataforfun.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class KataForFunService {
    public String convert(int input) {
        String divisorResult = divisorsRules(input);
        String contentResult = contentsRules(input);

        if (checkIfDefaultRule(divisorResult, contentResult)) {
            return defaultResult(input);
        }
        return divisorResult + contentResult;
    }

    private boolean checkIfDefaultRule(String divisorResult, String contentResult) {
        return divisorResult.isEmpty() && contentResult.isEmpty();
    }

    private String defaultResult(int input) {
        return "" + input;
    }

    private String contentsRules(int input) {

        return getContentStrats(input)
                .stream()
                .map(ContentStrat::getStratValue)
                .collect(Collectors.joining());
    }

    private List<ContentStrat> getContentStrats(int input) {
        return ("" + input).chars()
                .mapToObj(c -> (char) c)
                .map(ContentStrat::of)
                .collect(Collectors.toList());
    }

    private String divisorsRules(int input) {
        return isDivisibleBy3Rule(input) + isDivisibleBy5Rule(input);
    }

    private String isDivisibleBy3Rule(int input) {
        if (input % 3 == 0) {
            return "Kata";
        }
        return "";
    }

    private String isDivisibleBy5Rule(int input) {
        if (input % 5 == 0) {
            return "For";
        }
        return "";
    }


    private enum ContentStrat {
        KATA('3', "Kata"),
        FOR('5', "For"),
        FUN('7', "Fun"),
        DEFAULT(' ', "");

        private final Character input;
        private final String stratValue;

        ContentStrat(Character input, String stratValue) {
            this.input = input;
            this.stratValue = stratValue;
        }

        static ContentStrat of(Character input) {
            return Arrays.stream(values())
                    .filter(strat -> strat.input.equals(input))
                    .findFirst()
                    .orElse(DEFAULT);
        }

        public String getStratValue() {
            return stratValue;
        }
    }
}
