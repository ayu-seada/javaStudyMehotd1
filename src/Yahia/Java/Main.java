package Yahia.Java;

public class Main {

    public static void main(String[] args) {
        int higScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Juan",higScorePosition);

        higScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Jose",higScorePosition);

        higScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Manuel",higScorePosition);

        higScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Fran",higScorePosition);


    }
    public static void displayHighScorePosition(String playersName,int playerPosition){
        System.out.print(playersName +" managed to get into position " + playerPosition + " on the high score table ");

    }
    public static int calculateHighScorePosition(int playerScore){
        if (playerScore > 1000){
            return 1;}
        else if (playerScore >500 && playerScore<1000){
            return 2;}
        else if (playerScore >100 && playerScore<500 ){
            return 3;
        }
        else return 4;



    }
}
