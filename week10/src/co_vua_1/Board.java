package co_vua_1;

import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT  = 8;

    private ArrayList<Piece> pieces;

    /**
     * Constructor 1.
     */
    public Board() {
        pieces = new ArrayList<>();
    }

    /**
     * validate.
     */
    public boolean validate(int x, int y) {
        return 1 <= x && 1 <= y && x <= 8 && y <= 8;
    }

    /**
     * addPiece.
     */
    public void addPiece(Piece piece) {
        if (validate(piece.getCoordinatesX(), piece.getCoordinatesY())
                && getAt(piece.getCoordinatesX(), piece.getCoordinatesY()) == null) {
            pieces.add(piece);
        }
    }

    /**
     * removeAt.
     */
    public void removeAt(int x, int y) {
        if (validate(x, y)) {
            pieces.remove(getAt(x, y));
        }
    }

    /**
     * getAt.
     */
    public Piece getAt(int x, int y) {
        for (Piece piece : pieces) {
            if (piece.getCoordinatesX() == x && piece.getCoordinatesY() == y) {
                return piece;
            }
        }
        return null;
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }
}
