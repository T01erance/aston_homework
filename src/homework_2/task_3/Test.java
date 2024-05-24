package homework_2.task_3;

public class Test {
    public static void main(String[] args) {
        Computer.Processor myProcessor = new Computer.Processor();
        System.out.println(myProcessor.getDetails());
        myProcessor.model = "i5";
        System.out.println(myProcessor.getDetails());

        Computer myComputer = new Computer();
        Computer.RAM myRAM = myComputer.new RAM();
        System.out.println(myRAM.getDetails());
        myRAM.size = 8192;
        System.out.println(myRAM.getDetails());

        Object computer = new Computer();
        System.out.println(computer.hashCode());


    }
}
