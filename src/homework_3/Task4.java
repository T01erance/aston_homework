package homework_3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(duplicateСharacters(line));

    }

    private static String duplicateСharacters(String line) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            stringBuilder.append(line.charAt(i));
            stringBuilder.append(line.charAt(i));
        }
        return stringBuilder.toString();
    }
}
