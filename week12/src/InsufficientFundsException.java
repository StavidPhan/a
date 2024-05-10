public class InsufficientFundsException extends BankException {
    /**
     * Constructor 1.
     */
    public InsufficientFundsException(double amount) {
        super("Số tiền không hợp lệ: $" + String.format("%.2f", amount));
    }
}
