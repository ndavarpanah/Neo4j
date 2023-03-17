public class CarFactory extends AbstractFactory{

    @Override
    public Car getCar(String car) {
        if(car.equalsIgnoreCase("Honda"))
            return Honda.getInstance();
        else if(car.equalsIgnoreCase("Tesla"))
            return Tesla.getInstance();
        else if(car.equalsIgnoreCase("Porsche"))
            return Porsche.getInstance();
        else
            return null;
    }

    @Override
    public Airplane getAirplane(String airplane) {
        return null;
    }

    @Override
    public Boat getBoat(String boat) {
        return null;
    }
}
