package com.oxiane.kata.kataforfun.service;

public class KataForFunService {
    public String convert(int input) {
        if (input == 3) {
            return "KataKata";
        }
        if (input == 5) {
            return "ForFor";
        }
        return ""+input;
    }
}
