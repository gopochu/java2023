package business_logic.user.replenishment_and_withdrawal;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

//Внесение наличных

public class Refill {
    private BigDecimal balance;

    public Refill(BigDecimal balance) {
        this.balance = balance;
    }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }


    public BigDecimal getBalance() {
        return balance;
    }

    @Getter
    @Setter
    private int b = 10;
}