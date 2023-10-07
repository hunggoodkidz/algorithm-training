package DataStructure;

import java.util.Arrays;

public class ChineseChess2DArrays {
    public static  void  main(String[] args){
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
