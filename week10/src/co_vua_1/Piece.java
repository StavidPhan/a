package co_vua_1;

import java.util.Objects;

public abstract class Piece {
    private int coordinatesX;
    private int coordinatesY;
    private String color;

    /**
     * Constructor 1.
     */
    public Piece(int coordinatesX, int coordinatesY) {
        if (1 <= coordinatesX && 1 <= coordinatesY && coordinatesX <= 8 && coordinatesY <= 8) {
            this.coordinatesX = coordinatesX;
            this.coordinatesY = coordinatesY;
        }
        this.color = "white";
    }

    /**
     * Constructor 2.
     */
    public Piece(int coordinatesX, int coordinatesY, String color) {
        if (1 <= coordinatesX && 1 <= coordinatesY && coordinatesX <= 8 && coordinatesY <= 8) {
            this.coordinatesX = coordinatesX;
            this.coordinatesY = coordinatesY;
        }
        if (Objects.equals(color, "black") || Objects.equals(color, "white")) {
            this.color = color;
        } else {
            this.color = "white";
        }
    }

    public abstract String getSymbol();

    public abstract boolean canMove(Board board, int x, int y);

    public int getCoordinatesX() {
        return coordinatesX;
    }

    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    public int getCoordinatesY() {
        return coordinatesY;
    }

    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract boolean checkPosition(Piece piece);
}
