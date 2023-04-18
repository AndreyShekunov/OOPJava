package task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    /*
    - Создать класс СтудентКомпаратор реализующий интерфейс Comparator
    - Реализовать контракт compare () со сравнением по какому-либо параметру (пример: сочетание Имя+Фамилия)
     */
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Сергей", "Иванов", 1, 5));
        students.add(new Student("Максим", "Жиглов", 2, 4));
        students.add(new Student("Алексей", "Петров", 1, 3));
        students.add(new Student("Семен", "Кротов", 1, 4));
        students.add(new Student("Владислав", "Листьев", 2, 5));
        students.add(new Student("Екатерина", "Ветрова", 2, 5));

        StudentsGroupIterator groupIterator1 = new StudentsGroupIterator(students);
        while (groupIterator1.hasNext()) {
            System.out.println(groupIterator1.next());
        }

        System.out.println("------------------------------------------------------");

        Collections.sort(students, new StudentsCamparator());

        StudentsGroupIterator groupIterator = new StudentsGroupIterator(students);
        while (groupIterator.hasNext()) {
            System.out.println(groupIterator.next());
        }
    }

}
