package homework_2.task_1;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sedan sedan = (Sedan) o;
        return numberOfDoor == sedan.numberOfDoor && trunkCapacity == sedan.trunkCapacity && Objects.equals(luxuryLevel, sedan.luxuryLevel) && Objects.equals(fuelType, sedan.fuelType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfDoor, trunkCapacity, luxuryLevel, fuelType);
    }
}
