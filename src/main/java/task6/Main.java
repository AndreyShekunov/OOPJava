package task6;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /*
    - Создать класс Студент
    - Создать класс УчебнаяГруппа
    - Создать класс УчебнаяГруппаИтератор, заставив его реализовать интерфейс Iterator
    - Реализовать его контракты (включая удаление)
     */

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Сергей", "Иванов", 1));
        students.add(new Student("Максим", "Жиглов", 2));
        students.add(new Student("Алексей", "Петров", 1));
        students.add(new Student("Семен", "Кротов", 1));
        students.add(new Student("Владислав", "Листьев", 2));
        students.add(new Student("Екатерина", "Ветрова", 2));

        StudentsGroupIterator groupIterator = new StudentsGroupIterator(students);

        while (groupIterator.hasNext()) {
            System.out.println(groupIterator.next());
        }
    }
}
