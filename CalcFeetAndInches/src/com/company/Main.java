package com.company;

public class Main {

    public static void main(String[] args) {
        while(true) {
         int i=0;
         double[] storeResult = new double[10];
           storeResult[i] = calcFeetAndInchesToCentimeters(12, 4.25);
            System.out.println(storeResult[i]);
            i++;

            storeResult[i] = calcFeetAndInchesToCentimeters(5, 2.5);
            System.out.println(storeResult[i]);
            i++;

            storeResult[i] = calcFeetAndInchesToCentimeters(24.785);
            System.out.println(storeResult[i]);
            i++;

            storeResult[i] = calcFeetAndInchesToCentimeters(5, 25);
            System.out.println(storeResult[i]);
            i++;

            storeResult[i] = calcFeetAndInchesToCentimeters(-35, 25);
            System.out.println(storeResult[i]);
            i++;

            storeResult[i] = calcFeetAndInchesToCentimeters(-25);
            System.out.println(storeResult[i]);
            i++;


            


            break;
        }
    }

    public static double calcFeetAndInchesToCentimeters (double feet,double inch)
    {
        if(feet<0 || inch<0 || inch>12)
            return -1;

        double toCentimeters = inch*2.54 + feet*12*2.54;
        System.out.println("feet " + feet + "inches " + inch + " = ");
        return toCentimeters;

    }

    public static double calcFeetAndInchesToCentimeters (double inch)
    {
        if(inch<0)
            return -1;

        int feet = (int)inch/12;
        double inchRemiander = inch%12;
        return calcFeetAndInchesToCentimeters(feet,inchRemiander);


    }
}
