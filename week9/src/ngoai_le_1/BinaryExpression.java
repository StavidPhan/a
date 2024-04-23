package ngoai_le_1;

public abstract class BinaryExpression extends Expression {
    protected Expression left;
    protected Expression right;

    /**
     * Constructor 1.
     */
    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public abstract String toString();

    public abstract double evaluate();
}
