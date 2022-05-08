package com.company.homework6_exceptions;

import java.util.Scanner;

public class DivideNumbers {

    public static void main(String[] args) {
        int firstNumber, secondNumber;

        DivideNumbers divNum = new DivideNumbers();
        firstNumber = divNum.getInt("Enter first number: ");
        secondNumber = divNum.getInt("Enter second number: ");

        try {
            System.out.println(firstNumber / 0);

        } catch (ArithmeticException e){
            e.printStackTrace();
        }

    }

    int getInt(String text) {
        System.out.print(text);

        while (true) {
            try {
                return Integer.parseInt(new Scanner(System.in).next());
            } catch (NumberFormatException ne) {
                System.out.print("That's not a whole number.\n" + text);
            }
        }
    }
}
