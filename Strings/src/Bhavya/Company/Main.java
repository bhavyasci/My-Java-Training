package Bhavya.Company;

public class Main {

    public static void main(String[] args) {
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
        String myString = "My name is Bhavya";
        System.out.println(myString);
        myString = myString + " and I am a Java Expert";
        System.out.println(myString);
        myString = myString + " \u00A9 2020";
        System.out.println(myString);

        String numericString = "10";
        int myInt  = 50;
        numericString = numericString + myInt; //It will not add 
        System.out.println(numericString);


    }
}
