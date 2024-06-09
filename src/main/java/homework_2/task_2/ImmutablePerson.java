package homework_2.task_2;

import java.util.ArrayList;
import java.util.List;

public final class ImmutablePerson {
    private final String name;
    private final int age;
    private final List<String> hobbies;

    public ImmutablePerson(String name, int age, List<String> hobbies) {
        List<String> hobbiesCopy = new ArrayList<>(hobbies);
        this.name = name;
        this.age = age;
        this.hobbies = hobbiesCopy;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getHobbies() {
       List<String> hobbiesCopy = new ArrayList<>(hobbies);
        return hobbiesCopy;
    }

}
