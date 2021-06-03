package com.company;

public class BordTriangke {

   private int numOfStones = 0;
    private char colorOfStones = 'N';
    private boolean isEmpty =true;


    public  void setNumOfStones(int numOfStones) {
       this.numOfStones = numOfStones;
    }

    public void setColorOfStones(char colorOfStones) {
        this.colorOfStones = colorOfStones;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public int getNumOfStones() {
        return numOfStones;
    }

    public char getColorOfStones() {
        return colorOfStones;
    }

    public boolean isEmpty() {
        return isEmpty;
    }
}
