package Homework3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /*
    К коду с семинара добаить класс Teacher и возможность итерации и компорации для него.
    Так же для учебной группы добавить преподавателя(У группы может быть только один преподаватель,
    у проподавателя сколько угодно групп)
     */

    public static void main(String[] args) {
        List<Teacher> teachers = new ArrayList<>();

        StudentGroup studentGroupOne = new StudentGroup(1, "Максим", "Сергеев");
        studentGroupOne.getStudents().add(new Student("Сергей", "Иванов", 5));
        studentGroupOne.getStudents().add(new Student("Максим", "Жиглов", 4));
        studentGroupOne.getStudents().add(new Student("Алексей", "Петров", 3));

        StudentGroup studentGroupTwo = new StudentGroup(2, "Маргарита", "Хохлова");
        studentGroupTwo.getStudents().add(new Student("Семен", "Кротов", 4));
        studentGroupTwo.getStudents().add(new Student("Владислав", "Листьев", 5));
        studentGroupTwo.getStudents().add(new Student("Екатерина", "Ветрова", 5));

        TeachingStaff teachingStaff = new TeachingStaff();
        teachingStaff.getTeachers().add(new Teacher("Максим", "Сергеев"));
        teachingStaff.getTeachers().add(new Teacher("Маргарита", "Хохлова"));
        teachingStaff.getTeachers().add(new Teacher("Валентина", "Прошкина"));

        TeacherGroupIterator teacherGroupIterator = new TeacherGroupIterator(teachers);
        while (teacherGroupIterator.hasNext()) {
            System.out.println(teacherGroupIterator.next());
        }

    }
}
