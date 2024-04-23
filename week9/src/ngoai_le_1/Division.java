package ngoai_le_1;

public class Division extends BinaryExpression {
    /**
     * Constructor 1.
     */
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * toString.
     */
    @Override
    public String toString() {
        return String.format("(%s / %s)", left.toString(), right.toString());
    }

    /**
     * evaluate.
     */
    @Override
    public double evaluate() throws ArithmeticException {
        if (right.evaluate() == 0) {
            throw new ArithmeticException("Lỗi chia cho 0");
        } else {
            return left.evaluate() / right.evaluate();
        }
    }
}
