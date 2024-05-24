package homework_3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();
        //Вывожу строки меньше средней арифметической длины
        double averageLength = getAverageLength(line1, line2, line3);
        if (line1.length() < averageLength) {
            System.out.println("строка: " + line1 + "\nЕё длина: " + line1.length());
        }
        if (line2.length() < averageLength) {
            System.out.println("строка: " + line2 + "\nЕё длина: " + line2.length());
        }
        if (line3.length() < averageLength) {
            System.out.println("строка: " + line3 + "\nЕё длина: " + line3.length());
        }
    }

    private static double getAverageLength(String line1, String line2, String line3) {
        double averageLength = (double) (line1.length() + line2.length() + line3.length()) / 3;
        return averageLength;
    }
}
