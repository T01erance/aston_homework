package homework_2.task_2;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        List<String> hobbies = new ArrayList<>();
        hobbies.add("reading");
        hobbies.add("fishing");
        MutablePerson person_1 = new MutablePerson("Sergey", 34, hobbies);
        System.out.println("Хобби: " + person_1.getHobbies().get(0) + "," + person_1.getHobbies().get(1));
        System.out.println("Возраст - " + person_1.getAge());
        System.out.println("Имя - " + person_1.getName());

        person_1.setAge(45);
        System.out.println("Хобби: " + person_1.getHobbies().get(0) + "," + person_1.getHobbies().get(1));
        System.out.println("Возраст - " + person_1.getAge());
        System.out.println("Имя - " + person_1.getName());

        ImmutablePerson person_2 = new ImmutablePerson("Lenin", 54, hobbies);
        System.out.println("Хобби: " + person_2.getHobbies().get(0) + "," + person_2.getHobbies().get(1));
        System.out.println("Возраст - " + person_2.getAge());
        System.out.println("Имя - " + person_2.getName());

        person_2.getHobbies().remove(1);
        person_2.getHobbies().add("riding in an armored car");
        System.out.println("Хобби: " + person_2.getHobbies().get(0) + "," + person_2.getHobbies().get(1));
        System.out.println("Возраст - " + person_2.getAge());
        System.out.println("Имя - " + person_2.getName());
    }
}
