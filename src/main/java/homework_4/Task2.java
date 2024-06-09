package homework_4;

import java.util.LinkedList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> countries = new LinkedList<>();
//      добавить
        countries.addFirst("Россия");
        countries.addFirst("Франция");
        countries.addLast("США");
        countries.addLast("Бразилия");
        System.out.println(countries);
// получить по одному элементу
        System.out.println(countries.getFirst());
        System.out.println(countries.getLast());
// удалить по одному элементу
        countries.removeFirst();
        countries.removeLast();
        System.out.println(countries);

    }
}
