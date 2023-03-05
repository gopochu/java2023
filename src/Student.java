import java.util.Random;
import java.util.Scanner;

public class Student {
    int scholarship = randomize();
    public static void main(String[] args) {
    }
    private static int randomize(){
        int min = 1000;
        int max = 10000;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        return (i);
    }
    public String getName(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = in.nextLine();
        return(name);
    }
    public int getScholarship(){
        return(scholarship);
    }
}
