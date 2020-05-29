package Bhavya.Company;

public class Main {

    public static void main(String[] args) {
        int sumOf3=0;
        int sumOf5=0;

        for(int i=1;i<=1000;i++){
           if(i%3==0 && i%5==0)
           {
               sumOf3=sumOf3+1;
               sumOf5=sumOf5+1;
           }
           else if(i%3==0)
               sumOf3 = sumOf3+1;
           else if(i%5==0)
               sumOf5= sumOf5+1;


        }

        System.out.println("Numbers divided by 3 are "+sumOf3);
        System.out.println("Numbers Divided by 5 are "+sumOf5);

        int number = 4;
        int finishNumber = 20;

        while (number<=finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("its an even number " + number);
        }



    }


    public static boolean isEvenNumber(int n){
        if(n%2==0)
            return true;
        else
            return false;
    }

}
