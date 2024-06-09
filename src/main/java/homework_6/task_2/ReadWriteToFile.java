package homework_6.task_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ReadWriteToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        writeToFile(line);

        readFromFile("src\\homework_6\\task_2\\tms.txt");
    }

    static private void writeToFile(String line) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("src\\homework_6\\task_2\\tms.txt");
            fileOutputStream.write(line.getBytes(StandardCharsets.UTF_8));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private static void readFromFile(String path) {
        try (FileInputStream fileInputStream = new FileInputStream(path)) {
            char character;
            while (fileInputStream.available() != 0) {
                character = (char) fileInputStream.read();
                if (character == ' ') {
                    character = '_';
                }
                System.out.print(character);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
