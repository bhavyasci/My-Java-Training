package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore(bhavya, 100);
        calculateScore(40);
        calculateScore();
    }

    public static int calculateScore(String playerName , int score){
        System.out.println("Player: " + playerName + " scored" + score + " Points");
        return score*100;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed Player  scored" + score + " Points");
        return score*100;
    }

    public static int calculateScore(){
        System.out.println("No ");
        return 0;
    }
}
