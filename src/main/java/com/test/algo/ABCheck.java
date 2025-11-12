package com.test.algo;

public class ABCheck {

    public static void main(String[] args) {
        System.out.println(isValids("aabbb"));
        System.out.println(isValids("aba"));
        System.out.println(isValids("bbb"));
        System.out.println(isValids("aaa"));
    }

    public static boolean isValids(String s) {
        return !s.contains("ba");
    }

    public static boolean isValid(String s) {
        boolean seenB = false;

        for (char c : s.toCharArray()) {
            if (c == 'b') {
                seenB = true; // once we see a 'b', mark it
            } else if (seenB && c == 'a') {
                // if we already saw a 'b' and now see an 'a', invalid
                return false;
            }
        }
        return true;
    }
}
