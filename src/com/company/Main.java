package com.company;

public class Main {

    public static void main(String[] args) {

	  BordTriangke[] Bord = new BordTriangke[24];
	 for (int i = 0;i<24;i++ ){
		 BordTriangke test = new BordTriangke();
	 	Bord[i]=test;
	 	System.out.println(Bord[i]);
	 }
	 Bord[23].setNumOfStones(15);
	 Bord[23].setColorOfStones('W');
	 Bord[23].setEmpty(false);
	 Bord[11].setNumOfStones(15);
	 Bord[11].setColorOfStones('B');
	 Bord[11].setEmpty(false);




    }




}
