package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
       // System.out.println(areEqualByThreeDecimalPlaces(3.175,-3.176));
        //System.out.println(areEqualByThreeDecimalPlaces(3.0,3.0));
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

    public static boolean areEqualByThreeDecimalPlaces(double x,double y){
        int x1= (int) (x*1000);
        int y1 = (int) (y*1000);
      //  System.out.println(x1+ " " + y1);
         return x1==y1;


    }

    public static boolean hasEqualSum(int x,int y,int z){
        return (x+y)==z;
    }

    public static boolean hasTeen(int x,int y,int z){
        return (x>=13 || x<=19 || y>=13 || y<=19 || z>=13 || z<=19);
    }

    public static boolean isTeen(int x){
        return (x>=13 || x<=19);
    }
}
