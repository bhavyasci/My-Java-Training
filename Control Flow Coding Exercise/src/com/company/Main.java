package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void printNumberInWord(int n){
        switch(n){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;

        }
    }



    public static boolean isLeapYear(int year){
        if(year<1 || year>9999)
            return false;

        if(year%4==0) {
            if (year % 100 == 0)
            {
                return year % 400 == 0;
            }
            else return true;
        }
        else return false;
    }

    public static int getDaysInMonth(int month,int year){
        if(month<1 || month>12 || year<1 || year>9999)
            return -1;

        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                     return 31;
            case 2:
                if(isLeapYear(year))
                return 29;
                else
                return 28;
            case 4: case 6: case 9: case 11:
                return 30;
        }
        return -1;
    }



    public static boolean isOdd(int number){
        if(number<=0)
            return false;

        else if (number%2==0)
            return false;
        else return true;
    }
    public static int sumOdd(int start,int end){
        if(start<=0 || end<=0 ||start>end)
            return -1;
        int sum=0;
        for(start=start;start<=end;start++)
        {
            if(isOdd(start))
                sum+=start;
        }

        return sum;

    }
}
