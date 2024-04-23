package ngoai_le_1;

public class Numeral extends Expression {
    private double value;

    /**
     * Constructor 1.
     */
    public Numeral() {
        this.value = 0;
    }

    /**
     * Constructor 2.
     */
    public Numeral(double value) {
        this.value = value;
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        return String.format("%.0f", value);
    }

    /**
     * evaluate.
     */
    @Override
    public double evaluate() {
        return value;
    }
}
