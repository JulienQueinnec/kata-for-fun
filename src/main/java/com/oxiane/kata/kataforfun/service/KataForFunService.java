package com.oxiane.kata.kataforfun.service;

public class KataForFunService {
    public String convert(int input) {
        StringBuilder sb = new StringBuilder();

        sb.append(isDivisibleBy3Rule(input))
          .append(isDivisibleBy5Rule(input))
          .append(contains3Rule(input))
          .append(contains5Rule(input))
          .append(contains7Rule(input));

        return checkIfDefaultRule(input, sb);
    }

    private String checkIfDefaultRule(int input, StringBuilder sb) {
        if (sb.isEmpty()) {
            return "" + input;
        } else {
            return sb.toString();
        }
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

    private String contains3Rule(int input) {
        if (("" + input).contains("3")) {
            return "Kata";
        }
        return "";
    }

    private String contains5Rule(int input) {
        if (("" + input).contains("5")) {
            return "For";
        }
        return "";
    }

    private String contains7Rule(int input) {
        if (("" + input).contains("7")) {
            return "Fun";
        }
        return "";
    }

}
