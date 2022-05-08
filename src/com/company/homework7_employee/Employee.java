package com.company.homework7_employee;

public class Employee {

    final int id = 1;
    final String firstName = "Ivelina";
    final String lastName = "Vecheva";
    private double salary;

   public Employee(double salary) {
        this.salary = salary;
    }

    private String getName(){
       return (firstName + " " + lastName);
    }

    private double getAnnualSalary(double salary){
       return salary*12;
    }

    private double raiseSalary(double salaryIncrease){
       if(salaryIncrease <= 0){
           System.out.print("No salary increase.");
       }else
       {
           salary = salary*12*(100 + salaryIncrease)/100;
       }
        return salary;
    }

    public String toString(String name, double raisedSalary) {
        return ("The employee is " + name +". The annual salary is: " + raisedSalary + ".");

    }

    public static void main(String[] args) {
       Employee qa = new Employee(1200);
        String qaName = qa.getName();
        double qaRaisedSalary = qa.raiseSalary(20);
        String allInfo = qa.toString(qaName, qaRaisedSalary);
        System.out.println(allInfo);
    }
}
