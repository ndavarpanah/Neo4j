public class Porsche implements Car{

    //SINGLETON
    //Make construcor private
    private Porsche() {}

    //Create a static variable of type Honda
    private static Porsche instance = null;


    //User will call getInstance instead of Constructor to get HondaFactory
    public static Porsche getInstance() {
        if (instance==null)
            instance = new Porsche(); //Create only one Porsche Object
        return instance;
    }
//END_SINGLETON

    @Override
    public void build() {
        System.out.println("Porsche builds a car");
    }

    @Override
    public void repair() {
        System.out.println("Porsche repairs a car");
    }

    @Override
    public void restore() {
        System.out.println("Porsche restores a car");
    }
}

