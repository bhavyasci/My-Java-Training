package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumDigits(1));
    }

    public static int sumDigits(int number){
        if(number<10)
            return -1;
        int sum=0;
        while(number>0)
        {
            sum += number%10;
            number=number/10;
        }
        return sum;
    }
}
