package Homework3;

import java.util.List;

public class Teacher {
    private String firstName;
    private String lastName;
//    private List<Student> groups;

    public Teacher(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return String.format("Имя: %s, Фамилия: %s", firstName, lastName);
    }

//    public void addGroup(StudentGroup studentGroup) {
//        groups.add(Student);
//    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

}
