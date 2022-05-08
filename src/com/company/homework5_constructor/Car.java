package com.company.homework5_constructor;

public class Car {
    private String name, color;
    private  int releaseYear;
    private  double horsePower;
    private  boolean secondHandTick;


    public Car(String name, String color, int releaseYear, double horsePower, boolean secondHandTick) {
        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHandTick = secondHandTick;
    }

    public Car(String name, String color, boolean secondHandTick) {
        this.name = name;
        this.color = color;
        this.secondHandTick = secondHandTick;
        releaseYear = -1;
        horsePower = -1;
    }

    public Car(String name, String color, int releaseYear, double horsePower) {
        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        secondHandTick = false;
    }

    public Car(String name, int releaseYear, double horsePower, boolean secondHandTick) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.horsePower = horsePower;
        this.secondHandTick = secondHandTick;
        color = "N/A";
    }

    public Car() {
    }

    public static void main(String[] args) {
        Car carHonda = new Car("Honda", 2000, 100,true);
        Car carVolvo = new Car("Volvo", "red",false);

        System.out.println(carVolvo.releaseYear);

    }
}
