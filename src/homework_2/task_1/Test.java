package homework_2.task_1;

public class Test {
    public static void main(String[] args) {
        Sedan lada = new Sedan(3, "luxe", 110, "petrol");

        System.out.println(lada);
        lada.start();
        lada.stop();
        System.out.println(lada.getLuxuryLevel());
        System.out.println(lada.getFuelType());
        System.out.println(lada.getNumberOfDoors());
        System.out.println(lada.getTrunkCapacity());

        Truck kamaz = new Truck(2,2000, 200, "diesel");
        kamaz.start();
        kamaz.stop();
        System.out.println(kamaz.getMaxLoadCapacity());
        System.out.println(kamaz.getFuelType());
        System.out.println(kamaz.getNumberOfDoors());
        System.out.println(kamaz.getTrunkCapacity());

        Sedan sedan1 = new Sedan(4,"Q", 150, "95");
        Sedan sedan2 = new Sedan(4,"Q", 150, "95");
        System.out.println(sedan1.hashCode());
        System.out.println(sedan2.hashCode());

        System.out.println(sedan1.equals(sedan2));

    }
}
