package com.loops;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your Salary: ");
        int salary = input.nextInt();
        if(salary > 25000) {
            salary = salary + 2000;
        } else if (salary > 10000) {
            salary = salary + 1000;
        } else {
            salary += 1000;
        }
        System.out.println("You have been promoted and your new Salary is: " + salary);
    }
}
