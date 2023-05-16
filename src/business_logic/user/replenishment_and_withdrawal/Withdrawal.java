package business_logic.user.replenishment_and_withdrawal;

import java.math.BigDecimal;

//Снятие наличных
public class Withdrawal {
    private BigDecimal balance;

    public Withdrawal(BigDecimal balance) {
        this.balance = balance;
    }

    public void deposit(BigDecimal amount) {
        balance =balance.subtract(amount);
    }


    public BigDecimal getBalance() {
        return balance;
    }
}
