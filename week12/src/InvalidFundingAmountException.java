public class InvalidFundingAmountException extends BankException {
    /**
     * Constructor 1.
     */
    public InvalidFundingAmountException(double amount) {
        super("Số dư tài khoản không đủ $" + String.format("%.2f", amount)
                + " để thực hiện giao dịch");
    }
}
