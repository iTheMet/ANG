public class Game {


    static BordTriangke[] board = new BordTriangke[24];
    static char turnOfTheColor ;
    static int countOfTurn = 0;
    public static void chooseFirst()    {
        Dice blackDice = new Dice();
        Dice whiteDice = new Dice();
        //int whiteDice = 0;
        //int blackDice = 0;
        while (whiteDice.getDiceNum()==blackDice.getDiceNum()) {
           // whiteDice = 1 + (int) (Math.random() * 6);
            //blackDice = 1 + (int) (Math.random() * 6);
            whiteDice.rollDice();
            blackDice.rollDice();
        }
        if (whiteDice.getDiceNum()>blackDice.getDiceNum()){
            System.out.println("Первыми ходят белые "+whiteDice.getDiceNum()+" против "+blackDice.getDiceNum());
            turnOfTheColor = 'W';
        }
        else{
            System.out.println("Первыми ходят чёрные "+blackDice.getDiceNum()+" против "+whiteDice.getDiceNum());
            turnOfTheColor = 'B';
        }


    }
    public static void setGame(/*int boardSize*/){



        for (int i = 0; i < board.length; i++ ){
            BordTriangke test = new BordTriangke();
            board[i]=test;
          //  System.out.println(board[i]);
        }
        board[23].setNumOfStones(15);
        board[23].setColorOfStones('W');
        board[23].setEmpty(false);
        board[11].setNumOfStones(15);
        board[11].setColorOfStones('B');
        board[11].setEmpty(false);
    }
    public static void showGame(){
        System.out.print('A');
        for (int i = 12; i<board.length;  i++ ) {
            if(i!=18)
                System.out.print(" ");
            else
                System.out.print("|");

            System.out.print(i);



        }
        System.out.println(" B");

////////////////////////////////////////////////////////////////////

        System.out.print('A');
        for (int i = 12; i<board.length;  i++ ) {
            if(i!=18)
                System.out.print(" ");
            else
                System.out.print("|");
            System.out.print("——");

        }
        System.out.println(" B");
////////////////////////////////////////////////////////////////////

        System.out.print("|");
        for (int i = 12; i<board.length;  i++ ) {
            if(i!=18)
                System.out.print(" ");
            else
                System.out.print("|");
            if (board[i].getNumOfStones()<9)
                System.out.print(" ");
            System.out.print(board[i].getNumOfStones());

        }
        System.out.println(" |");
////////////////////////////////////////////////////////////////////


        System.out.print("|");
        for (int i = 12; i<board.length;  i++ ) {
            if(i!=18)
                System.out.print(" ");
            else
                System.out.print("|");

            System.out.print(" ");
            System.out.print(board[i].getColorOfStones());

        }
        System.out.println(" |");
////////////////////////////////////////////////////////////////////
        System.out.print('A');
        for (int i = 12; i<board.length;  i++ ) {
            if(i!=18)
                System.out.print(" ");
            else
                System.out.print("|");
            System.out.print("——");

        }
        System.out.println(" B");
////////////////////////////////////////////////////////////////////
        System.out.print("|");

        for (int i = 11; i>-1;  i-- ) {
            if(i!=5)
                System.out.print(" ");
            else
                System.out.print("|");

            System.out.print(" ");
            System.out.print(board[i].getColorOfStones());
        }
        System.out.println(" |");
////////////////////////////////////////////////////////////////////
        System.out.print("|");
        for (int i = 11; i>-1;  i-- ) {
            if(i!=5)
                System.out.print(" ");
            else
                System.out.print("|");
            if (board[i].getNumOfStones()<9)
                System.out.print(" ");
            System.out.print(board[i].getNumOfStones());

        }
        System.out.println(" |");
////////////////////////////////////////////////////////////////////
        System.out.print('A');
        for (int i = 12; i<board.length;  i++ ) {
            if(i!=18)
                System.out.print(" ");
            else
                System.out.print("|");
            System.out.print("——");

        }
        System.out.println(" B");


////////////////////////////////////////////////////////////////////
        System.out.print('A');
        for (int i = 11; i>-1;  i-- ) {
            if(i!=5)
                System.out.print(" ");
            else
                System.out.print("|");

            if (i<10)
                System.out.print(" ");

            System.out.print(i);



        }
        System.out.println(" B");

    }
    public static void turn(){

        if (turnOfTheColor=='W' && countOfTurn!=0)
            System.out.println("Ход номер "+countOfTurn+"| ходят белые");
        if (turnOfTheColor=='B' && countOfTurn!=0)
            System.out.println("Ход номер "+countOfTurn+ "| ходят Чёрные");
        int dice1 = 1 + (int) (Math.random() * 6);
        int dice2 = 1 + (int) (Math.random() * 6);
        System.out.println("Бросок костей");
        if (dice1!=dice2){
            System.out.println("выпали числа "+dice1+" "+dice2);
        }
        else {
            System.out.println("выпали числа "+dice1+" "+dice2);
            System.out.println("Сука гош");
        }




        } //Думать тут


    }



