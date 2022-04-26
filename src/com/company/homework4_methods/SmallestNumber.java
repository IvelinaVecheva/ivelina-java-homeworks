package com.company.homework4_methods;

public class SmallestNumber {
    final double number1 = 0.225;
    final double number2 = -0.225;
    final double number3 = -1.225;

    public SmallestNumber() {
    }

    public double smallestNumber(double number1, double number2, double number3){
        double temp = Math.min(number1, number2);
        temp = Math.min(temp, number3);

//        if (number1 > number2) {
//            temp = number2;
//        }
//        if (number1 > number3) {
//            temp = number3;
//        }

        return temp;
    }

    public static void main(String[] args) {
        SmallestNumber sm = new SmallestNumber();
        System.out.println(sm.smallestNumber(sm.number1, sm.number2, sm.number3));
    }
}
