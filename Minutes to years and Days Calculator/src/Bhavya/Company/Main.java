package Bhavya.Company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }


    public static void printYearsAndDays(long minutes){

        if (minutes<0)
            System.out.println("Invalid Value");

        long days = minutes/(24*60);
        long years = days/365;
        days =days%365;

        System.out.println(minutes+" min"+" = "+years+" y and "+days+" d");


    }


}
