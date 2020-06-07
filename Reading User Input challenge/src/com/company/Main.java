package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int i=0,counter,sum=0;
        Scanner scanner=new Scanner(System.in);
	while (i<10){
	    System.out.println("Enter number #"+ (i+1) + ":");
	    boolean hasNextInt = scanner.hasNextInt();
	    if(hasNextInt) {
            counter = scanner.nextInt();
            sum +=counter;
            i++;
        }else
            System.out.println("Invalid Number");

	    scanner.nextLine();

    }
        System.out.println("sum of all 10 numbers is: "+sum);

	scanner.close();
    }
}
