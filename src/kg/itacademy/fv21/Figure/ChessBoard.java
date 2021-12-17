package kg.itacademy.fv21.Figure;

public class ChessBoard {
    private final String[][] board;

    public ChessBoard(){
        this.board = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = "x";
            }
        }

    }

    public void fillBoard(String figure, int x, int y) {
        this.board[x][y] = figure;
    }

    public void showBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }

		//for(int i = 0; i <array.length; i++) {
        //for (int j = 0; j < array[i].length; j++) {
            //System.out.print(array[i][j] + "\t");

        }

    }



//str[0][0] -- это доступ к первому элементу -- самое последнее задание 4ж
