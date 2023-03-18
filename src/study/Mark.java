package study;

import java.security.SecureRandom;

public class Mark {
    static int markOf = randomize();
    public static void main(String[] args) {
    /*
    Дописать
     */
    }
    private static int randomize(){
        int min = 2;
        int max = 5;
        int diff = max - min;
        SecureRandom random = new SecureRandom();
        int i = random.nextInt(diff + 1);
        i += min;
        return (i);
    }
    public int getMark(){
        return(markOf);
    }
}
