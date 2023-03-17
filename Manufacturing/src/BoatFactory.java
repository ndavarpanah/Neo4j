public class BoatFactory extends AbstractFactory{

    @Override
    public Car getCar(String car) {
        return null;
    }

    @Override
    public Airplane getAirplane(String airplane) {
        return null;
    }

    @Override
    public Boat getBoat(String boat) {
        if(boat.equalsIgnoreCase("SeaRay"))
            return new SeaRay();
        else if(boat.equalsIgnoreCase("Mastercraft"))
            return new Mastercraft();
        else if(boat.equalsIgnoreCase("Bertram"))
            return new Bertram();
        else
            return null;
    }
}
