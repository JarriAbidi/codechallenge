package com.tenpearls.challenge;

import java.util.ArrayDeque;
import java.util.Queue;

public class Challenge {

    public static void main(String[] args) {
    }

    public static Integer[] sortOddBeforeEven(Integer[] input) {
        Queue<Integer> odd = new ArrayDeque<>();
        Queue<Integer> even = new ArrayDeque<>();
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 != 0) {
                odd.add(input[i]);
            } else {
                even.add(input[i]);
            }
        }
        odd.addAll(even);
        return odd.toArray(new Integer[odd.size()]);
    }
}