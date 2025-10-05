package com.test.algo;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class GetTargetSumCombination {

    public static void main(String[] args) {

        int targetSum = 5;

        int[] arrayOfInt = {1,2,3,4,5,6,1,1};

        Set<String> output = new HashSet<>();

        for (int x : arrayOfInt){

            int total = targetSum - x;

            boolean found = IntStream.of(arrayOfInt).anyMatch(n -> n == total);

            if(found){
                if(x < total){
                    output.add(x+","+total);
                } else {
                    output.add(total+","+x);
                }
            }
        }
        System.out.println(output);
    }


}
