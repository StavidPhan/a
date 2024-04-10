import java.util.ArrayList;
import java.util.Objects;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList;

    /**
     * Constructor.
     */
    public Account() {
        balance = 0;
        transitionList = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<Transaction> getTransactionList() {
        return transitionList;
    }

    /**
     * nap tien.
     */
    private void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            Transaction transaction = new Transaction("deposit", amount, this.balance);
            transitionList.add(transaction);
        } else {
            System.out.println("So tien ban nap vao khong hop le!");
        }
    }

    /**
     * rut tien.
     */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > this.balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            this.balance -= amount;
            Transaction transaction = new Transaction("withdraw", amount, this.balance);
            transitionList.add(transaction);
        }
    }

    /**
     * them vao lich su giao dich.
     */
    public void addTransaction(double amount, String operation) {
        if (Objects.equals(operation, Transaction.DEPOSIT)) {
            deposit(amount);
        } else if (Objects.equals(operation, Transaction.WITHDRAW)) {
            withdraw(amount);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * in ra lich su giao dich.
     */
    public void printTransaction() {
        int index = 1; // stt cua giao dich
        for (Transaction transaction : transitionList) {
            System.out.printf("Giao dich %d: %s $%.2f. So du luc nay: $%.2f.%n",
                    index++,
                    (Objects.equals(transaction.getOperation(), Transaction.DEPOSIT))
                            ? "Nap tien" : "Rut tien",
                    transaction.getAmount(),
                    transaction.getBalance());
        }
    }
}
