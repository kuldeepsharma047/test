package com.example.demo.Utils;

public class StringUtils {
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    String toUpperCase(String str) {
        return str.toUpperCase();
    }

    String toLowerCase(String str) {
        return str.toLowerCase();
    }

    String trim(String str) {
        return str.trim();
    }
}
