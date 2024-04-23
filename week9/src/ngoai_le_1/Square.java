package ngoai_le_1;

public class Square extends Expression {
    private final Expression expression;

    /**
     * Constructor 1.
     */
    public Square(Expression expression) {
        this.expression = expression;
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        return String.format("(%s) ^ 2", expression.toString());
    }

    /**
     * evaluate.
     */
    @Override
    public double evaluate() {
        return expression.evaluate() * expression.evaluate();
    }
}