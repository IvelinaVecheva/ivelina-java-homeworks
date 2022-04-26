package com.company.homework4_methods;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordsCount {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String text = myScanner.nextLine();

        WordsCount sentence = new WordsCount();
        System.out.println(sentence.countWordsUsingStringTokenizer(text));

    }

    public static int countWordsUsingStringTokenizer(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        StringTokenizer tokens = new StringTokenizer(sentence);
        return tokens.countTokens();
    }


}
