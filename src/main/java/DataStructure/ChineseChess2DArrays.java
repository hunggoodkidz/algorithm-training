package DataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class ChineseChess2DArrays {
    public static void main(String[] args) {
        String[][] chingchongBoard = new String[3][3];
        Scanner scanner = new Scanner(System.in);

        int cellValue = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                chingchongBoard[i][j] = Integer.toString(cellValue);
                cellValue++;
            }
        }

        printBoard(chingchongBoard);

        int currentPlayer = 1;

        while (true) {
            System.out.println("Player " + currentPlayer + ", enter the number of the cell where you want to place your mark:");
            int move = scanner.nextInt();

            if (move >= 1 && move <= 9) {
                int row = (move - 1) / 3;
                int col = (move - 1) % 3;

                if (chingchongBoard[row][col].equals(Integer.toString(move))) {
                    chingchongBoard[row][col] = (currentPlayer == 1) ? "X" : "O";
                    printBoard(chingchongBoard);
                    if (checkWin(chingchongBoard, currentPlayer)) {
                        System.out.println("Player " + currentPlayer + " wins!");
                        break;
                    }
                    currentPlayer = (currentPlayer == 1) ? 2 : 1;
                } else {
                    System.out.println("Cell already occupied. Try again.");
                }
            } else {
                System.out.println("Invalid input. Enter a number between 1 and 9.");
            }
        }
    }

    public static void printBoard(String[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean checkWin(String[][] board, int currentPlayer) {
        // Check rows, columns, and diagonals for a win
        for (int i = 0; i < 3; i++) {
            if (board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2]) && board[i][0].equals((currentPlayer == 1) ? "X" : "O")) {
                return true;
            }
            if (board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i]) && board[0][i].equals((currentPlayer == 1) ? "X" : "O")) {
                return true;
            }
        }
        if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && board[0][0].equals((currentPlayer == 1) ? "X" : "O")) {
            return true;
        }
        if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && board[0][2].equals((currentPlayer == 1) ? "X" : "O")) {
            return true;
        }
        return false;
    }


    public static void ChingChongBoard(){
        String [][] chingchongBoard = new String[3][3];
        //The different between char vs String is char legally to use '' but String oppositely use ""
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0; j < 3 ; j++){
                chingchongBoard[i][j] = "-";
            }
        }

        //Let me visualize for y'all to easily understand how we live in The Matrix worked with [i][j] ?

        // so j go first start with a Row of a square based
        //Columns #0
        chingchongBoard[0][0] = "1";
        chingchongBoard[0][1] = "2";
        chingchongBoard[0][2] = "3";

        //Columns #1
        chingchongBoard[1][0] = "4";
        chingchongBoard[1][1] = "5";
        chingchongBoard[1][2] = "6";

        //Columns #2
        chingchongBoard[2][0] = "7";
        chingchongBoard[2][1] = "8";
        chingchongBoard[2][2] = "9";

        System.out.println(Arrays.deepToString(chingchongBoard)); // deeptoString is for [i][j] but toString is getting Alien Language lmao
    }

}
