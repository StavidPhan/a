package co_vua_1;

public class Rook extends Piece {
    /**
     * Constructor 1.
     */
    public Rook(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    /**
     * Constructor 2.
     */
    public Rook(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        if (!board.validate(x, y) || (getCoordinatesX() != x && getCoordinatesY() != y)) {
            return false;
        }

        // kiem tra xem tren duong di co vuong quan co nao khong
        if (getCoordinatesX() == x) {
            int minY = Math.min(getCoordinatesY(), y);
            int maxY = Math.max(getCoordinatesY(), y);
            for (int i = minY + 1; i < maxY; i++) {
                if (board.getAt(x, i) != null) {
                    return false;
                }
            }
        } else {
            int minX = Math.min(getCoordinatesX(), x);
            int maxX = Math.max(getCoordinatesX(), x);
            for (int i = minX + 1; i < maxX; i++) {
                if (board.getAt(i, y) != null) {
                    return false;
                }
            }
        }

        Piece destination = board.getAt(x, y);
        return destination == null || !destination.getColor().equals(getColor());
    }

    @Override
    public boolean checkPosition(Piece piece) {
        return false;
    }
}
