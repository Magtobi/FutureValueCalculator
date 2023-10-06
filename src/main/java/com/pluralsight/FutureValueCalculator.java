package com.pluralsight;

import java.util.Scanner;

public class FutureValueCalculator {
    // Future Value Calculator
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter your deposit amount: ");
        double deposit = myScanner.nextDouble();
        System.out.println(deposit);

        System.out.println("Your interest: ");
        double interest = myScanner.nextDouble();
        System.out.println(interest);

        System.out.println("Number of years: ");
        double years = myScanner.nextDouble();
        System.out.println(years);

        interest /= 100;
        double total = deposit * Math.pow(interest + 1 , years);

        double totalinterest = total - deposit;
        System.out.printf("Your total is: %.2f" , total);
        System.out.println();
        System.out.printf("Your total interest is: %.2f" ,totalinterest);
        myScanner.close();
    }
}
