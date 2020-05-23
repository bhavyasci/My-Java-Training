package Bhavya.Company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int switchValue = 3;
        switch (switchValue){
            case 1:
                System.out.println("Its number 1");
                break;
            case 2:
                System.out.println("its number 2");
                break;
            case 3:case 4:case 5:
                System.out.println("its number 3");
                break;
            default:
                System.out.println("its a default block");
        }
        String month = "JanUarY";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Its Jan");
                break;
            case "february":
                System.out.println("its feb");
                break;
            case "August":case "June":case "May":
                System.out.println("its number may jun aug");
                break;
            default:
                System.out.println("its a default block");
        }
    }
}
