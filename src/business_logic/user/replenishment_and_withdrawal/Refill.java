package business_logic.user.replenishment_and_withdrawal;
import java.math.BigDecimal;

public class Refill {
    private String cardNumber;
    private BigDecimal balance;

    public Refill(String cardNumber, BigDecimal balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
