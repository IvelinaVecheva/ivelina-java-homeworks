package com.company.homework4_methods;

public class AverageNumber {
    final int number1;
    final int number2;
    final int number3;

    public AverageNumber(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
      }

    public double avgNumber(){
        return (number1 + number2 + number3)/3.0;
    }

    public static void main(String[] args) {
        AverageNumber averageNumber = new AverageNumber(5,7,6);
        System.out.println(averageNumber.avgNumber());
    }
}
