package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min=2147483647,max=-2147483648; // We can use Integer.MAX_VALUE and Integer.MIN_VALUE
     //   boolean first=true;
        while (true){
            System.out.println("Enter Number");
            boolean isHasInt = scanner.hasNextInt();
            if(!isHasInt)
                break;
            else
            {
                int x=scanner.nextInt();
//                if(first){
//                    max=x;
//                    min=x;
//                    first=false;
//                }
                if (x > max)
                    max = x;
                if (x < min)
                    min=x;

            }
                scanner.nextLine();

        }
        System.out.println("max= "+max+" ,min= "+min);
        scanner.close();
    }
}
