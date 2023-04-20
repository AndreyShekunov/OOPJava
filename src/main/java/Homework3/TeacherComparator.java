package Homework3;

import java.util.Comparator;

public class TeacherComparator implements Comparator<Teacher> {

    @Override
    public int compare(Teacher teacherOne, Teacher teacherTwo) {
        if (teacherOne.getLastName().length() > teacherTwo.getLastName().length()) {
            return -1;
        }
        if (teacherOne.getLastName().length() < teacherTwo.getLastName().length()) {
            return 1;
        }
        return 0;
    }
}
