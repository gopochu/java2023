package study;

import study.Mark;
import study.Student;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task {
    static Logger log = Logger.getLogger(Task.class.getName());
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
        log.info("Введите номер задания: ");
        in.nextLine();
        log.info(name + ", ваша оценка за задание: " + mark + ", ваша стипендия: " + scholarship + " рублей");//Почему-то не получается использовать format, разобраться и переделать
    }
}
