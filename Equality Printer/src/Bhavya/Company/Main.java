package Bhavya.Company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printEqual(1,1,1);
        printEqual(1,2,3);
        printEqual(-1,2,1);
    }

    public static void printEqual(int x,int y,int z){

        if(x<0 || y<0 || z<0)
            System.out.println("Invalid Value");

        else if(x==y && x==z)
            System.out.println("All numbers are equal");
        else if(x!=y && y!=z && x!=z)
            System.out.println("All numbers are different");
        else
            System.out.println("Neither all are equal or different");
    }
}