package task6;

public class Student {

    private String firstName;
    private String lastName;
    private Integer groupId;

    Student(String firstName, String lastName, Integer groupId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupId = groupId;
    }

    public String toString() {
        return String.format("Имя: %s, Фамилия: %s, Номер группы: %d", firstName, lastName, groupId);
    }
}
