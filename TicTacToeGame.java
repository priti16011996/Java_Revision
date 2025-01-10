import java.util.Scanner;
public class TicTacToeGame {

    static String[] Tic_Tac_Toe_Board;
    static String turn;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tic_Tac_Toe_Board = new String[9];
        turn ="X";

        for(int i=0; i<9; i++)
        {
            Tic_Tac_Toe_Board[i] = String.valueOf(i+1);
        }
        System.out.println("Welcome to the tic tac toe game");


        System.out.println("|----|----|----|");
        System.out.println(" | "+Tic_Tac_Toe_Board[0]+" | "+Tic_Tac_Toe_Board[1]+" | "+Tic_Tac_Toe_Board[2]+" | ");
        System.out.println("|---------------|");
        System.out.println(" | "+Tic_Tac_Toe_Board[3]+" | "+Tic_Tac_Toe_Board[4]+" | "+Tic_Tac_Toe_Board[5]+" | ");
        System.out.println("|---------------|");
        System.out.println(" | "+Tic_Tac_Toe_Board[6]+" |  "+Tic_Tac_Toe_Board[7]+" | "+Tic_Tac_Toe_Board[8]+"|");
        System.out.println("|----|----|----|");
    }


}
