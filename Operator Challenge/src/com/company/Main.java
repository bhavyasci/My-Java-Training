package com.company;

public class Main {

    public static void main(String[] args) {
        double myFirst= 20d;
        double mySecondVar = 80d;

        double cal = ((myFirst + mySecondVar)*100)%40;

        boolean result = cal==0? true:false;
        System.out.println(result);

        if (!result)
            System.out.println("got some remainder");
        else
            System.out.println("remainder is zero");
    }
}
