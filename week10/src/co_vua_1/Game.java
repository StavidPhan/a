package co_vua_1;

import java.util.ArrayList;

public class Game {
    private Board board;
    private ArrayList<Move> moveHistory;

    /**
     * Constructor 1.
     */
    public Game(Board board) {
        this.board = board;
        this.moveHistory = new ArrayList<>();
    }

    /**
     * movePiece.
     */
    public void movePiece(Piece piece, int x, int y) {
        if (piece.canMove(board, x, y)) {
            Move move;
            Piece pieceAt = board.getAt(x, y);
            // truong hop khong co quan co o diem can di chuyen den
            if (pieceAt == null) {
                move = new Move(
                        piece.getCoordinatesX(), x,
                        piece.getCoordinatesY(), y,
                        piece
                );
                // truong hop co quan co o diem can di chuyen den
            } else {
                move = new Move(
                        piece.getCoordinatesX(), x,
                        piece.getCoordinatesY(), y,
                        piece,
                        pieceAt
                );
                board.removeAt(x, y);
            }

            moveHistory.add(move);
            piece.setCoordinatesX(x);
            piece.setCoordinatesY(y);
        }
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }
}
