package com.test.algo;
import java.util.*;
import java.util.stream.Collectors;

public class GroupByDigitSumTraditional {

    public static void main(String[] args) {
        int[] arr = {33, 42, 27, 90};
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            int sum = digitSum(num);
            map.put(sum, map.getOrDefault(sum, 0) + num);
        }

        int max = 0;
        for (int value : map.values()) {
            max = Math.max(max, value);
        }

        int result = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(
                        GroupByDigitSumTraditional::digitSum,
                        Collectors.summingInt(Integer::intValue)
                ))
                .values()
                .stream()
                .max(Integer::compare)
                .orElse(0);

        System.out.println(result); // Output: 117
    }

    private static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

}
