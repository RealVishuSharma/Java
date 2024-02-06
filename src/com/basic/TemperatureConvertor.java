package com.basic;

import java.util.Scanner;

public class TemperatureConvertor {
    public static void main(String[] args) {
        System.out.println("This is a Temperature Convertor.");
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Temperature in Celcius: ");
        float tempC = input.nextFloat();

        float tempF = (tempC * 9/5)  + 32;
        System.out.println("The " + tempC + "*C in Fahrenheit is: " + tempF);
        input.close();
    }
}
