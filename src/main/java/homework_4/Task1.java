package homework_4;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("Россия");
        countries.add("Китай");
        countries.add("Андорра");
        System.out.println(countries);

        countries.set(1, "Казахстан");
        System.out.println(countries);

        countries.remove(1);
        System.out.println(countries);

        countries.remove("Андорра");
        System.out.println(countries);
        countries.add("Китай");
        countries.add("Андорра");

        System.out.println(getIndex(countries, "Китай"));
        System.out.println(getIndex(countries, "Андорра"));
        System.out.println(getIndex(countries, "Россия"));

        System.out.println(countries.contains("Андорра"));
        System.out.println(countries.contains("Нидерланды"));
    }

    private static int getIndex(List<String> countries, String country) {
        for (int i = 0; i < countries.size(); i++) {
            if (countries.get(i).equals(country)) {
                return i;
            }
        }
        return -1;
    }
}
