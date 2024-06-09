package homework_4.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Марина", 23, 2,
                new ArrayList<>(Arrays.asList(4, 5, 3, 4))));
        studentList.add(new Student("Игорь", 23, 1,
                new ArrayList<>(Arrays.asList(2, 3, 3, 2))));
        studentList.add(new Student("Паша", 32, 5,
                new ArrayList<>(Arrays.asList(2, 2, 3, 2))));
        studentList.add(new Student("Миша", 23, 2,
                new ArrayList<>(Arrays.asList(4, 3, 3, 5))));
        studentList.add(new Student("Лиза", 23, 1,
                new ArrayList<>(Arrays.asList(4, 3, 3, 4))));

        System.out.println(studentList);
        removePoorStudent(studentList);
        System.out.println(studentList);

        moveToNextCourse(studentList);
        System.out.println(studentList);

        System.out.println(getStudentsByCourse(studentList, 2));

    }

    private static void removePoorStudent(List<Student> studentList) {
        List<Student> poorStudentList = new ArrayList<>();
        for (Student student : studentList) {
            if (Student.averageMark(student.markList) < 3) {
                poorStudentList.add(student);
            }
        }
        studentList.removeAll(poorStudentList);
    }

    private static void moveToNextCourse(List<Student> studentList) {
        for (Student student : studentList) {
            student.course++;
        }

    }

    private static List<Student> getStudentsByCourse(List<Student> students, int course) {
        List<Student> resultList = new ArrayList<>();
        for (Student student : students) {
            if (student.course == course) {
                resultList.add(student);
            }
        }
        return resultList;
    }

}
