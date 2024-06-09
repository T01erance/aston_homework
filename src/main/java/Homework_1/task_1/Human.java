package Homework_1.task_1;

public class Human {
    private String name;
    private String lastName;
    private int age;

    Human() {
        name = "Аноним";
        lastName = "Анонимович";
        age = 43;
    }

    Human(int age) {
        name = "Аноним";
        lastName = "Анонимович";
        this.age = age;
    }

    Human(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
