package org.example;

import java.util.Arrays;

public class Main {
    public int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        int carry = 1;
        while (index != -1 && carry != 0) {
            if (digits[index] + carry > 9) {
                carry = digits[index] + carry - 9;
                digits[index] = 0;
                --index;
            } else {
                digits[index] += carry;
                carry = 0;
            }
        }

        if (digits[0] == 0) {
            int[] newDigits = new int[digits.length + 1];
            for (int i = 1; i < newDigits.length; i++) {
                newDigits[i] = digits[i-1];
            }
            newDigits[0] = carry;
            return newDigits;
        }

        return digits;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}