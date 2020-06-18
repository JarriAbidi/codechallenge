package com.tenpearls.challenge;

import java.util.ArrayDeque;
import java.util.Deque;

public class Challenge {

    public static void main(String[] args) {
    }

    public static Integer[] sortOddBeforeEven(Integer[] input) {
        Deque<Integer> result = new ArrayDeque<>();
        int last = input.length - 1;
        for (int i = 0; i <= last; i++) {
            if (input[last - i] % 2 != 0) {
                result.addFirst(input[last - i]);
            }
            if (input[i] % 2 == 0) {
                result.addLast(input[i]);
            }
        }
        return result.toArray(new Integer[result.size()]);
    }
}