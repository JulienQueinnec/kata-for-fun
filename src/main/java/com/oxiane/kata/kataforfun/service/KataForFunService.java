package com.oxiane.kata.kataforfun.service;

public class KataForFunService {
    public String convert(int input) {
        StringBuilder sb = new StringBuilder();

        if (input % 3 == 0) {
            sb.append("Kata");
        }
        if (input % 5 == 0) {
            sb.append("For");
        }
        String inputString = "" + input;
        if (inputString.contains("3")) {
            sb.append("Kata");
        }
        if (inputString.contains("5")) {
            sb.append("For");
        }
        if (sb.isEmpty()) {
            return "" + input;
        } else {
            return sb.toString();
        }

    }
}
