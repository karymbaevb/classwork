package kg.itacademy.fv21.done.board;

import kg.itacademy.fv21.done.figure.Rectangle;

public class ChessBoard {
    private final Rectangle[][] rectangles = new Rectangle[8][8];

    public final void setSimpleRectangle(Rectangle rectangle, int i, int j){
        rectangles[i][j] = rectangle;
    }













    public Rectangle getSimpleRectangle(int i, int j){
        return rectangles[i][j];
    }
}
