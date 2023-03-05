import java.util.Random;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Mark mark = new Mark();
        int xmark = mark.getMark();

        Student student = new Student();
        int xscholarship = student.getScholarship();
        String name = student.getName();

        checkTask(name, xmark, xscholarship);
    }

    private static void checkTask(String name, int mark, int scholarship){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер задания: ");
        String i = in.nextLine();
        System.out.println(name + ", ваша оценка за задание: " + mark + ", ваша стипендия: " + scholarship + " рублей");
    }
}
