package com.tenpearls.challenge;

import java.util.ArrayDeque;
import java.util.Deque;

public class Challenge {

    public static void main(String[] args) {
    }

    public static Integer[] sortOddBeforeEven(Integer[] input) {
        Deque<Integer> result = new ArrayDeque<>();
        int l = input.length;
        for (int i = 0; i < l; i++) {
            if (input[l - 1 - i] % 2 != 0) {
                result.addFirst(input[l - 1 - i]);
            }
            if (input[i] % 2 == 0) {
                result.addLast(input[i]);
            }
        }
        return result.toArray(new Integer[result.size()]);
    }
}