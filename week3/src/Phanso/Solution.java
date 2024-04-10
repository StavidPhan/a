package Phanso;

public class Solution {
    private int numerator;
    private int denominator = 1;

    /**
     * Constructor.
     *
     * @param numerator abc
     */
    public Solution(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    /**
     * setDenominator.
     */
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    /**
     * tim UCLN cua x, y.
     */
    public int gcd(int x, int y) {
        if (x < 0) {
            x = -x;
        }
        if (y < 0) {
            y = -y;
        }
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }

    /**
     * toi gian phan so.
     */
    public Solution reduce() {
        int gcd = gcd(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;

        return this;
    }

    /**
     * cong 2 phan so.
     */
    public Solution add(Solution a) {
        this.numerator = this.numerator * a.denominator + this.denominator * a.numerator;
        this.denominator *= a.denominator;

        return this.reduce();
    }

    /**
     * tru 2 phan so.
     */
    public Solution subtract(Solution a) {
        this.numerator = this.numerator * a.denominator - this.denominator * a.numerator;
        this.denominator *= a.denominator;

        return this.reduce();
    }

    /**
     * nhan 2 phan so.
     */
    public Solution multiply(Solution a) {
        this.numerator *= a.numerator;
        this.denominator *= a.denominator;

        return this.reduce();
    }

    /**
     * chia 2 phan so.
     */
    public Solution divide(Solution a) {
        this.numerator *= a.denominator;
        this.denominator *= a.numerator;

        return this.reduce();
    }

    /**
     * so sanh 2 phan so.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            if (this.numerator * other.denominator == this.denominator * other.numerator) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution a = new Solution(2,4);
        Solution b = new Solution(2,3);
        System.out.println(a.reduce().numerator, a.reduce().denominator);
    }
}
