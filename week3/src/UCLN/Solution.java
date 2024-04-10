package UCLN;

public class Solution {
    /**
     * Return gcd in int.
     *
     * @param x first number
     * @param y second number
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
}
