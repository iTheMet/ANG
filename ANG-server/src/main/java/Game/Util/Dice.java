package Game.Util;

public class Dice {
    private  int diceNum = 1 ;




    private boolean isUsed =false;


    public boolean isUsed() {
        return isUsed;
    }
    public int getDiceNum() {
        return diceNum;
    }
    public void setUsed(boolean used) {
        isUsed = used;
    }

    public void rollDice(){
        diceNum = 1 +(int)(Math.random()*6);
    }
}
