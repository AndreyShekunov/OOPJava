package task7;

public class Student {

    private String firstName;
    private String lastName;
    private Integer groupId;
    private Integer average;

    Student(String firstName, String lastName, Integer groupId, Integer average) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupId = groupId;
        this.average = average;
    }

    public String toString() {
        return String.format("Имя: %s, Фамилия: %s, Номер группы: %d, Средний бал: %d", firstName, lastName, groupId, average);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public Integer getAverage() {
        return average;
    }
}
