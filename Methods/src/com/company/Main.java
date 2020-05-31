package com.company;

public class Main {

    public static void main(String[] args) {
//        int highScore;
//        highScore = calculateScore(true,800,5,100);
//        System.out.println("Your final score is: " + highScore);
//        highScore = calculateScore(true,10000,8,200);
//        System.out.println("Your final score is: " + highScore);

        int position;
        position = calculateHighScorePosition(1500);
        displayHighScorePosition("Bhavya",position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Bhavya",position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Bhavya",position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Bhavya",position);

    }

    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus)
    {
        if(gameOver)
        {
            int finalScore = score + (levelCompleted*bonus);
            finalScore += 1000;
          //  System.out.println("Your final score is: "+ finalScore);
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name+" managed to get into the position "+position);
    }

    public static int calculateHighScorePosition(int playerScore){
        int position = 4;

        if(playerScore >=1000)
            position = 1;
        else if(playerScore >=500)
            position = 2;
        else if(playerScore >=100)
            position = 3;

        return position;

    }
}
