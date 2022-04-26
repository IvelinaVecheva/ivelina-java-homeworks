package com.company.homework3_dataStructures;

import java.util.Scanner;

public class IsPalindrome {

    public static void main(String[] args) {

        boolean isPalindrome = false;
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = myScanner.nextLine();

        char[] word_arr = word.toCharArray();

        // check if length is odd
        if (word_arr.length % 2 == 1) {
            for (int i = 0; i < word_arr.length / 2; i++) {

                if (word_arr[i] != word_arr[word_arr.length - 1 - i]) {
                    isPalindrome = false;
                } else {
                    isPalindrome = true;
                }
            }
        }

        if(isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }
}