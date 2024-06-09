package homework_3;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();
        List<String> stringList = new ArrayList<>();
        stringList.add(line1);
        stringList.add(line2);
        stringList.add(line3);
        getSpecialWord(stringList);
    }

    private static void getSpecialWord(List<String> stringList) {
        for (String line : stringList) {
            Set<Character> characterSet = new HashSet<>();
            boolean foundSameChar = false;
            for (int i = 0; i < line.length(); i++) {
                if (characterSet.contains(line.charAt(i))) {
                    foundSameChar = true;
                    break;
                } else {
                    characterSet.add(line.charAt(i));
                }
            }
            if (!foundSameChar) {
                System.out.println(line);
                break;
            }
        }
    }
}
