package Homework3;

public class Student {
    private String firstName;
    private String lastName;
    private Integer average;

    Student(String firstName, String lastName, Integer average) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.average = average;
    }

    public String toString() {
        return String.format("Имя: %s, Фамилия: %s, Средний бал: %d", firstName, lastName, average);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public Integer getAverage() {
        return average;
    }
}
