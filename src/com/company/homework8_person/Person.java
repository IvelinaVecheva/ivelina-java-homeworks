package com.company.homework8_person;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {
    final String name, sex, religion, nativeLanguage, nationality, country, dateOfBirth;
    final int a = 0; //, age;
    final double idNumber;
    public double filledEGN;
    String job;


    public Person(String name, String sex, String religion, String nativeLanguage, String nationality, String country, String job) {
        this.name = name;
        this.sex = sex;
        this.religion = religion;
        this.nativeLanguage = nativeLanguage;
        this.nationality = nationality;
        this.country = country;
        this.dateOfBirth = addDateOfBirth();
        this.idNumber = addId();
        //    this.age = age;
        this.job = job;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Ivelina", "female", "Orthodox", "BG", "Bulgarian", "Bulgaria", "QA");

        System.out.println(person1.addDateOfBirth());
    //    System.out.println(person1.dateOfBirth.substring(0,2));
    }

    public double addId() {
        System.out.println("Enter EGN: ");

        while (true) {
            try {

                Scanner scan = new Scanner(System.in);
                double egn = scan.nextDouble();

                egn = Double.parseDouble(String.valueOf(egn));

                int count = 0;
                double num = egn;
                while (num > 0.999) {
                    num = num / 10;
                    ++count;
                }

                if (count == 10) {
                    System.out.println(Math.round(egn) + " is EGN");
                    filledEGN = egn;
                    System.out.println(Math.round(filledEGN) + " is filledEGN");
                    return egn;
                } else {
                    System.out.print("That's not a valid EGN. Enter EGN again:\n");
                }


            } catch (Exception e) {
                System.out.print("That's not a valid EGN. Enter EGN again:\n");
            }
        }
    }

    public String addDateOfBirth() {
        int temp = (int) (Math.round(filledEGN) / 10000);
        String dateOfBirth = Integer.toString(temp);
        System.out.println(dateOfBirth.length() );
//        String year = dateOfBirth.substring(0,2);
//        String month = dateOfBirth.substring(2,4);
//        String day = dateOfBirth.substring(4,6);

//        return (day + "." + month + "." + year);
        return dateOfBirth;
    }

}


