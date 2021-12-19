package kg.itacademy.fv21.done;

import kg.itacademy.fv21.done.board.ChessBoard;
import kg.itacademy.fv21.done.figure.Location;
import kg.itacademy.fv21.done.figure.Rectangle;
import kg.itacademy.fv21.done.paint.Drawer;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(final String[] args) {

        ChessBoard chessBoard = new ChessBoard();
        fillBoard(chessBoard);
        Drawer drawer = new Drawer(chessBoard);
        JFrame jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.getContentPane().add(drawer);
        jFrame.setVisible(true);
    }

    static void fillBoard(ChessBoard chessBoard) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Rectangle rectangle = new Rectangle(50);
                Location location = new Location();
                location.setY(50 * i);//движение вправо
                location.setX(50 * j);//движение вниз
                rectangle.setVisible(true);
                rectangle.setLocation(location);
                if ((i + j) % 2 == 0) {
                    rectangle.setColor(Color.BLACK);
                } else {
                    rectangle.setColor(Color.WHITE);
                }
                chessBoard.setSimpleRectangle(rectangle, i, j);
            }
        }

        System.out.println(Rectangle.count);
    }

}