package business_logic.user;


import lombok.Getter;

//Счёт
public class Bill {
    @Getter
    static double balance;
    public Bill(double balance){
        this.balance = balance;
    }
    public static void increase (int a){
        balance += a;
    }

    public static void decrease(int a){
        balance -= a;
    }
}