package homework_2.task_1;

public class Truck extends Car{
    int numberOfDoors;
    int trunkCapacity;
    int maxLoadCapacity;
    String fuelType;
    Truck(int numberOfDoors, int maxLoadCapacity, int trunkCapacity, String fuelType) {
        this.numberOfDoors = numberOfDoors;
        this.maxLoadCapacity = maxLoadCapacity;
        this.trunkCapacity = trunkCapacity;
        this.fuelType = fuelType;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    public int getTrunkCapacity(){
        return  trunkCapacity;
    }
    public  int getMaxLoadCapacity(){
        return maxLoadCapacity;
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
}
