package com.company.homework3;

import java.util.Scanner;

public class DynamicArray {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int a = myScanner.nextInt();

        System.out.println("Enter number of columns: ");
        int b = myScanner.nextInt();

        String[][] words = new String[a][b];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {

                System.out.println("Enter element word[" + i + "][" + j + "]");
                words[i][j] = scan.nextLine();
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println("word[" + i + "][" + j + "] = " + words[i][j] );

            }
        }

    }
}
