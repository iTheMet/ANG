import Game.Util.BordTriangke;
import Game.Util.Dice;

public class Game {
    static Dice[] dicePack = new Dice[4];



    static Dice utilDice1 = new Dice();
    static Dice utilDice2 = new Dice();

    static BordTriangke[] board ;
    static char turnOfTheColor ;

    static int countOfTurn = 0;
    public static void chooseFirst()    {

        //int whiteDice = 0;
        //int blackDice = 0;
        while (dicePack[2].getDiceNum()==dicePack[1].getDiceNum()) {
           // whiteDice = 1 + (int) (Math.random() * 6);
            //blackDice = 1 + (int) (Math.random() * 6);
            dicePack[2].rollDice();
            dicePack[1].rollDice();
        }
        if (dicePack[2].getDiceNum()>dicePack[1].getDiceNum()){
            System.out.println("Первыми ходят белые "+dicePack[2].getDiceNum()+" против "+dicePack[1].getDiceNum());
            turnOfTheColor = 'W';
        }
        else{
            System.out.println("Первыми ходят чёрные "+dicePack[1].getDiceNum()+" против "+dicePack[2].getDiceNum());
            turnOfTheColor = 'B';
        }


    }
    public static void setGame(int boardSize){
        while (0 != boardSize % 4){
            boardSize = boardSize + 1 ;}
    board= new BordTriangke[boardSize];
        System.out.println("Доска "+board.length);


        for (int i = 0; i < dicePack.length; i++ ){
            Dice whiteDice = new Dice();
            dicePack[i]=whiteDice;
            //  System.out.println(board[i]);
        }


        for (int i = 0; i < board.length; i++ ){
            BordTriangke test = new BordTriangke();
            board[i]=test;
          //  System.out.println(board[i]);
        }
        board[board.length-1].setNumOfStones(15);
        board[board.length-1].setColorOfStones('W');
        board[board.length-1].setEmpty(false);
        board[board.length/2-1].setNumOfStones(15);
        board[board.length/2-1].setColorOfStones('B');
        board[board.length/2-1].setEmpty(false);
    }
    public static void showGame(){
        System.out.print('A');
        for (int i = board.length/2; i<board.length;  i++ ) {
            if(i!= board.length/4*3)
                System.out.print(" ");
            else
                System.out.print("|");

            if (i<10)
                System.out.print(" ");

            System.out.print(i);



        }
        System.out.println(" B");

////////////////////////////////////////////////////////////////////

        System.out.print('A');
        for (int i = board.length/2; i<board.length;  i++ ) {
            if(i!= board.length/4*3)
                System.out.print(" ");
            else
                System.out.print("|");
            System.out.print("——");

        }
        System.out.println(" B");
////////////////////////////////////////////////////////////////////

        System.out.print("|");
        for (int i = board.length/2; i<board.length;  i++ ) {
            if(i!= board.length/4*3)
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
        for (int i = board.length/2; i<board.length;  i++ ) {
            if(i!= board.length/4*3)
                System.out.print(" ");
            else
                System.out.print("|");

            System.out.print(" ");
            System.out.print(board[i].getColorOfStones());

        }
        System.out.println(" |");
////////////////////////////////////////////////////////////////////
        System.out.print('A');
        for (int i = board.length/2; i<board.length;  i++ ) {
            if(i!= board.length/4*3)
                System.out.print(" ");
            else
                System.out.print("|");
            System.out.print("——");

        }
        System.out.println(" B");
////////////////////////////////////////////////////////////////////
        System.out.print("|");

        for (int i = board.length/2-1; i>-1;  i-- ) {
            if(i!=board.length/4-1)
                System.out.print(" ");
            else
                System.out.print("|");

            System.out.print(" ");
            System.out.print(board[i].getColorOfStones());
        }
        System.out.println(" |");
////////////////////////////////////////////////////////////////////
        System.out.print("|");
        for (int i = board.length/2-1; i>-1;  i-- ) {
            if(i!=board.length/4-1)
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
        for (int i = board.length/2; i<board.length;  i++ ) {
            if(i!= board.length/4*3)
                System.out.print(" ");
            else
                System.out.print("|");
            System.out.print("——");

        }
        System.out.println(" B");


////////////////////////////////////////////////////////////////////
        System.out.print('A');
        for (int i = board.length/2-1; i>-1;  i-- ) {
            if(i!=board.length/4-1)
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
        countOfTurn++;

        if (turnOfTheColor=='W' && countOfTurn!=0)
            System.out.println("Ход номер "+countOfTurn+"| ходят белые");
        if (turnOfTheColor=='B' && countOfTurn!=0)
            System.out.println("Ход номер "+countOfTurn+ "| ходят Чёрные");




        // int dice1 = 1 + (int) (Math.random() * 6);
        //int dice2 = 1 + (int) (Math.random() * 6);
        System.out.println("Бросок костей");
        if (dicePack[1].getDiceNum()!=dicePack[2].getDiceNum()){
            System.out.print("выпали числа "+dicePack[1].getDiceNum()+" "+dicePack[2].getDiceNum());
        }
        else {
            System.out.println("выпали числа "+dicePack[1].getDiceNum()+" "+dicePack[2].getDiceNum());
            System.out.println("Сука гош");
        }




        } //Думать тут


    }



