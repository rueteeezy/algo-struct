package com.test.algo;

public class SumOfIntegers {

    public static void main(String[] args) {
        int input = 345;
        int result = getSingleDigit(input);
        System.out.println("Output: " + result);
    }

    public static int getSingleDigit(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
                }
            num = sum;
            }
        return num;
        }
    }
