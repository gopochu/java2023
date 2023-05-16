package business_logic;

import business_logic.user.Bill;

import java.util.logging.LogRecord;
import java.util.logging.Logger;


public class TestData {
    static Bill bill = new Bill((Math.random() * 5000 + 500));
    static Logger logger = Logger.getLogger(TestData.class.getName());
    public static void main(String[] args) {
//        logger.info(bill.toString());
        System.out.println(Bill.getBalance());
    }

}
