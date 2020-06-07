package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String numberAsString = "2020";
        int number = Integer.parseInt(numberAsString);
        System.out.println(number+1);


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter of year of birth:");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line character (Enter Key)

            System.out.println("Enter your name:");
            String name = scanner.nextLine();
        }
        scanner.close();
    }
}
