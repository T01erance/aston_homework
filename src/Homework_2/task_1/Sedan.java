package Homework_2.task_1;

public class Sedan extends Car {
    int numberOfDoor;
    int trunkCapacity;
    String luxuryLevel;
    String fuelType;
    Sedan(int numberOfDoor, String luxuryLevel, int trunkCapacity, String fuelType) {
        this.numberOfDoor = numberOfDoor;
        this.luxuryLevel = luxuryLevel;
        this.trunkCapacity = trunkCapacity;
        this.fuelType = fuelType;
    }

    public int getNumberOfDoors() {
        return numberOfDoor;
    }
    public int getTrunkCapacity(){
        return  trunkCapacity;
    }
    public  String getLuxuryLevel(){
        return luxuryLevel;
    }
    public  String getFuelType(){
        return fuelType;
    }
    public void start(){
        System.out.println("Start");
    }
    public void stop(){
        System.out.println("Stop");
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "numberOfDoor=" + numberOfDoor +
                ", trunkCapacity=" + trunkCapacity +
                ", luxuryLevel='" + luxuryLevel + '\'' +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}
