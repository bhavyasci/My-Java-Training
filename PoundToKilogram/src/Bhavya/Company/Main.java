package Bhavya.Company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    double poundValue = in.nextDouble();
	    double poundEquivalentToKilo = 0.45359237;
	    double kiloValue = poundValue * poundEquivalentToKilo;

        System.out.println("Converted Kilograms: " + kiloValue);

        double anotherNumber = 3_000_000.456_777d;
        System.out.println(anotherNumber);

    }
}
