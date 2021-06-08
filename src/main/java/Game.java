public class Game {


    static BordTriangke[] board = new BordTriangke[24];

    public static void setGame(){


        for (int i = 0; i < 24; i++ ){
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

            System.out.print(i+1);



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

            if (i<9)
                System.out.print(" ");

            System.out.print(i+1);



        }
        System.out.println(" B");

    }



}