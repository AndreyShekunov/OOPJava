package Homework3;

import java.util.Comparator;

public class StudentsCamparator implements Comparator<Student> {
    @Override
    public int compare(Student studentOne, Student studentTwo) {
        if (studentOne.getAverage() > studentTwo.getAverage()) {
            return -1;
        }
        if (studentOne.getAverage() < studentTwo.getAverage()) {
            return 1;
        }
        if (studentOne.getLastName().length() > studentTwo.getLastName().length()) {
            return -1;
        }
        if (studentOne.getLastName().length() < studentTwo.getLastName().length()) {
            return 1;
        }
        return 0;
    }
}
