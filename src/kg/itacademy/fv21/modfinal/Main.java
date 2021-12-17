package kg.itacademy.fv21.modfinal;

import kg.itacademy.fv21.Figure.ChessBoard;

import javax.swing.*;
import java.util.concurrent.Callable;

public class Main {

    public static void main(final String[] args) {
        //JFrame jFrame = new JFrame();
        //jFrame.setSize(500, 500);
        //jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        //jFrame.getContentPane().add(drawer);
        //jFrame.setVisible(true);
        ChessBoard chessBoard = new ChessBoard();
        int temp = 2;

        for (int i = 0; i < 8; i++) {
            chessBoard.fillBoard("PW", 1, i);
            chessBoard.fillBoard("PB",6 , i);
        }
        chessBoard.fillBoard("DW", 0, 4);
        chessBoard.fillBoard("DB", 7, 3);
        chessBoard.fillBoard("KW", 0, 3);
        chessBoard.fillBoard("KB", 7, 4);
        for (int i = 0; i < 2; i++) {
            chessBoard.fillBoard("SW", 0, temp);
            chessBoard.fillBoard("SB", 7, temp);
            if(i == 0)
            temp--;
            else temp++;

            chessBoard.fillBoard("HW", 0, temp);
            chessBoard.fillBoard("HB", 7, temp);
            if(i == 0)
            temp--;
            else temp++;

            chessBoard.fillBoard("LW", 0, temp);
            chessBoard.fillBoard("LB", 7, temp);
            temp += 5;
        }

        chessBoard.showBoard();


            //public static int[] updateArray(int[] arr) {
              //  int[] temp = new int[arr.length];

                //for (int i = 0; i < temp.length; i++) {
                  //  temp[i] = arr[i];
               // }

                //arr = new int[10];

                //for (int i = 0; i < temp.length; i++) {
                  //  arr[i] = temp[i];
                //}
                //return arr;


            }
    }


