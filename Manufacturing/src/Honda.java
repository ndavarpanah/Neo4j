public class Honda implements Car{

//SINGLETON
    //Make construcor private
    private Honda() {}

    //Create a static variable of type Honda
    private static Honda instance = null;


    //User will call getInstance instead of Constructor to get HondaFactory
    public static Honda getInstance() {
        if (instance==null)
            instance = new Honda(); //Create only one Honda Object
        return instance;
    }
//END_SINGLETON

    @Override
    public void build() {
        System.out.println("Honda builds a car");
    }

    @Override
    public void repair() {
        System.out.println("Honda repairs a car");
    }

    @Override
    public void restore() {
        System.out.println("Honda restores a car");
    }
}
