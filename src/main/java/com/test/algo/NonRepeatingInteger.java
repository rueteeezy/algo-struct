package com.test.algo;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingInteger {

    public static void main(String[] args) {


        int[] arrayOfInt = {1,3,3,4,5,6,1,1};

        Map<Integer,Long> total = Arrays.stream(arrayOfInt)
                .boxed()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        System.out.println(
                total.entrySet()
                        .stream()
                        .filter(entry -> entry.getValue() == 1)
                        .map(Map.Entry::getKey)
                        .findFirst()
                        .orElse(-1)
        );


    }

}
