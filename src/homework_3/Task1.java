package homework_3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();

        String longestString = getLongestString(line1, line2, line3);
        String shortestString = getShortestString(line1, line2, line3);
        System.out.println("самая длинная строка: " + longestString + "\nЕё длина: " + longestString.length());
        System.out.println("самая короткая строка: " + shortestString + "\nЕё длина: " + shortestString.length());
    }

    private static String getLongestString(String line1, String line2, String line3) {
        String longestString;
        if (line1.length() > line2.length()) {
            if (line1.length() > line3.length()) {
                longestString = line1;
            } else {
                longestString = line3;
            }
        } else {
            if (line2.length() > line3.length()) {
                longestString = line2;
            } else {
                longestString = line3;
            }
        }
        return longestString;
    }

    private static String getShortestString(String line1, String line2, String line3) {
        String shortestString;
        if (line1.length() < line2.length()) {
            if (line1.length() < line3.length()) {
                shortestString = line1;
            } else {
                shortestString = line3;
            }
        } else {
            if (line2.length() < line3.length()) {
                shortestString = line2;
            } else {
                shortestString = line3;
            }
        }
        return shortestString;
    }


}
