package kg.itacademy.fv21.done.paint;

import kg.itacademy.fv21.done.board.ChessBoard;
import kg.itacademy.fv21.done.figure.Rectangle;

import java.awt.*;

public class Drawer extends Canvas {
    ChessBoard chessBoard;

    public Drawer(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    @Override
    public void paint(Graphics gr) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Rectangle rectangle = chessBoard.getSimpleRectangle(i, j);
                gr.setColor(rectangle.getColor());
                gr.fillRect(rectangle.getLocation().getX(), rectangle.getLocation().getY(),
                        rectangle.getW(), rectangle.getH()
                );
            }
        }
    }
}
