package Bhavya.Company;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;
        System.out.println(result);

        result++;
        System.out.println(result);

        result +=2;
        System.out.println(result);

        result =+2; //not a valid expression to use it will assign a new value
        System.out.println(result);

        result *=10;
        System.out.println(result);

        result /=5;
        System.out.println(result);

        boolean isAlien = true;
        if(isAlien == false)
            System.out.println("it is not an alien");
        else
            System.out.println("It is an Alien \uD83D\uDE31");
    }
}
