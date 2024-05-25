package homework_4;

import java.util.HashSet;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<>();

        Person igor = new Person("Игорь", 35);
        Person marina = new Person("Марина", 27);
        Person petia = new Person("Петя", 43);
        personSet.add(igor);
        personSet.add(marina);
        personSet.add(petia);

        for (Person person : personSet) {
            System.out.println(person);
        }

        personSet.remove(igor);
        personSet.remove(petia);
        System.out.println(personSet);

        System.out.println(personSet.contains(marina));
        System.out.println(personSet.contains(igor));

    }

    private static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
