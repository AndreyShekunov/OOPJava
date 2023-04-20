package Homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
 * К коду с семинара добаить класс Teacher и возможность итерации и компорации для него.
 * Так же для учебной группы добавить преподавателя
 *  (У группы может быть только один преподаватель, у проподавателя сколько угодно групп)
 */

public class Main {
    public static void main(String[] args) {

        Map<Integer, List<Student>> groups = new TreeMap<>();

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Максим", "Сергеев", 1));
        teachers.add(new Teacher("Маргарита", "Хохлова", 2));
        teachers.add(new Teacher("Валентина", "Прошкина", 3));

        List<Student> students = new ArrayList<>();
        students.add(new Student("Сергей", "Иванов", 5, 3));
        students.add(new Student("Максим", "Жиглов", 4, 1));
        students.add(new Student("Алексей", "Петров", 4, 2));
        students.add(new Student("Семен", "Кротов", 3, 3));
        students.add(new Student("Владислав", "Листьев", 5, 2));
        students.add(new Student("Екатерина", "Ветрова", 4, 2));

        TeacherGroupIterator iterTeacher = new TeacherGroupIterator(teachers);
        while (iterTeacher.hasNext()) {
            Teacher teacher = iterTeacher.next();
            StudentsGroupIterator iterStudent = new StudentsGroupIterator(students);
            List<Student> listStudentGroup = new ArrayList<>();
            while (iterStudent.hasNext()) {
                Student student = iterStudent.next();
                if (student.getTeacherId() == teacher.getId()) {
                    listStudentGroup.add(student);
                }
                groups.put(teacher.getId(), listStudentGroup);
            }
        }
        for (int i : groups.keySet()) {
            System.out.printf("Преподаватель id %d: \n%s", i, groups.get(i));
            System.out.printf("\nПреподаватель id %d : кол-во студентов: %d", i, groups.get(i).size());
            System.out.println();
            System.out.println();
        }
    }
}
