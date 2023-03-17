public class FactoryProducer {
    public static AbstractFactory getFactory(String factory){
        if(factory.equalsIgnoreCase("Car"))
            return new CarFactory();
        else if(factory.equalsIgnoreCase("Airplane"))
            return new AirplaneFactory();
        else if(factory.equalsIgnoreCase("Boat"))
            return new BoatFactory();
        else
            return null;
    }
}
