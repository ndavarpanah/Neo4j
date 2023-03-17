public class AirplaneFactory extends AbstractFactory{

    @Override
    public Car getCar(String car) {
        return null;
    }

    @Override
    public Airplane getAirplane(String airplane) {
        if(airplane.equalsIgnoreCase("Airbus"))
            return new Airbus();
        else if(airplane.equalsIgnoreCase("Boeing"))
            return new Boeing();
        else if(airplane.equalsIgnoreCase("Embraer"))
            return new Embraer();
        else
            return null;
    }

    @Override
    public Boat getBoat(String boat) {
        return null;
    }
}
