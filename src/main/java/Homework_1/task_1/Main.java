package Homework_1.task_1;

public class Main {

    public static void main(String[] args) {
        Tree myTree = new Tree();
        System.out.println(myTree);
        myTree.cutDown();
        System.out.println(myTree);

        Human newHuman = new Human(35);
        System.out.println(newHuman.getAge());
        newHuman.setAge(20);
        System.out.println(newHuman.getAge());
    }
}
