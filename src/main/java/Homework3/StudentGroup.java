package Homework3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup extends Teacher implements Iterable<Student>{
    private List<Student> students;
    int groupNumber;

    public StudentGroup(Integer groupNumber, String firstName, String lastName) {
        super(firstName, lastName);
        this.groupNumber = groupNumber;
        List<Student> students = new ArrayList<>();
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentsGroupIterator(students);
    }
}
