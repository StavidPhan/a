package ngoai_le_1;

public class Addition extends BinaryExpression {

    /**
     * Constructor 1.
     */
    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        return String.format("(%s + %s)", left.toString(), right.toString());
    }

    /**
     * evaluate.
     */
    @Override
    public double evaluate() {
        return left.evaluate() + right.evaluate();
    }
}
