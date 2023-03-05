import java.util.Random;

public class Mark {
    int mark = randomize();
    public static void main(String[] args) {

    }
    private static int randomize(){
        int min = 2;
        int max = 5;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        return (i);
    }
    public int getMark(){
        return(mark);
    }
}
