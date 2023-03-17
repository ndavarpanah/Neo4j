public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        AbstractFactory carFactory = FactoryProducer.getFactory("Car");
        AbstractFactory airplaneFactory = FactoryProducer.getFactory("Airplane");
        AbstractFactory boatFactory = FactoryProducer.getFactory("Boat");

        Car carOne = carFactory.getCar("Honda");
        Car carTwo = carFactory.getCar("Tesla");
        Car carThree = carFactory.getCar("Porsche");

        Airplane airplaneOne = airplaneFactory.getAirplane("Airbus");
        Airplane airplaneTwo = airplaneFactory.getAirplane("Boeing");
        Airplane airplaneThree = airplaneFactory.getAirplane("Embraer");

        Boat boatOne = boatFactory.getBoat("SeaRay");
        Boat boatTwo = boatFactory.getBoat("Mastercraft");
        Boat boatThree = boatFactory.getBoat("Bertram");

        carOne.build();
        carTwo.repair();
        carThree.restore();

        airplaneOne.build();
        airplaneTwo.repair();
        airplaneThree.restore();

        boatOne.build();
        boatTwo.repair();
        boatThree.restore();





    }
}