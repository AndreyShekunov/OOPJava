package Homework3;

import java.util.ArrayList;
import java.util.List;

public class TeachingStaff {
    private List<Teacher> teachers;

    public TeachingStaff() {
        List<Teacher> teachers = new ArrayList<>();
        this.teachers = teachers;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }


}
