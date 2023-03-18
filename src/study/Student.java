package study;

import java.security.SecureRandom;
import java.util.Scanner;
import java.util.logging.Logger;

public class Student {
    static Logger log = Logger.getLogger(Student.class.getName());
    int scholarship = randomize();
    public static void main(String[] args) {
        /*
        Необходимо заполнить main
         */
    }
    private static int randomize(){
        int min = 1000;
        int max = 10000;
        int diff = max - min;
        SecureRandom random = new SecureRandom();
        int i = random.nextInt(diff + 1);
        i += min;
        return (i);
    }
    public String getName(){
        Scanner in = new Scanner(System.in);
        log.info("Введите ваше имя: ");
        String name = in.nextLine();
        return(name);
    }
    public int getScholarship(){
        return(scholarship);
    }
}
