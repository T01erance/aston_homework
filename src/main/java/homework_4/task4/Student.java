package homework_4.task4;

import java.util.ArrayList;

public class Student {
    String name;
    int group;
    int course;
    ArrayList<Integer> markList;

    public Student(String name, int group, int course, ArrayList<Integer> markList) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.markList = markList;
    }

    static double averageMark(ArrayList<Integer> markList){
        double markSum = 0;
        for (Integer mark: markList){
            markSum+=mark;
        }
        return markSum/markList.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course +
                ", markList=" + markList +
                '}';
    }
}
