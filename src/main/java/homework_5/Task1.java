package homework_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Task1 {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(-5, 5, 6, 3, 2, 4, 5, 1, -9, 4, 11));
        Integer integerSum = arrayList.stream()
                .distinct()
                .peek(x -> System.out.println(x + " afterD"))
                .filter(a -> a % 2 == 0)
                .peek(x -> System.out.println(x + " afterF"))
                .reduce(0, (a, b) -> a + b);
        System.out.println(integerSum);

        System.out.println(arrayList.stream().distinct().collect(Collectors.toList()));
        System.out.println(arrayList.stream().distinct().filter(a -> a % 2 == 0).collect(Collectors.toList()));
        System.out.println(arrayList.stream().distinct().filter(a -> a % 2 == 0).reduce(0, (a, b) -> a + b));

    }
}
