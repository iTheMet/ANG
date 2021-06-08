public class Dice {
    private  int diceNum = 1 ;



    public int getDiceNum() {
        return diceNum;
    }
    public void rollDice(){
        diceNum = 1 +(int)(Math.random()*6);
    }
}
