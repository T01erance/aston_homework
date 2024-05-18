package Homework_1.task_1;

public class Tree {
    boolean isFruit;
    int age;
    double height;
    String name;

    Tree(){
      name = "appleTree";
      age = 15;
      height = 5.75;
      isFruit = true;
    }

    Tree(String name, int age){
        this.name = name;
        this.age = age;

    }

    public void cutDown(){
        this.height = 0;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "isFruit=" + isFruit +
                ", age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }
}
