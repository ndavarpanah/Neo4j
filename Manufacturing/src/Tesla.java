public class Tesla implements Car{

    //SINGLETON
    //Make construcor private
    private Tesla() {}

    //Create a static variable of type Honda
    private static Tesla instance = null;


    //User will call getInstance instead of Constructor to get HondaFactory
    public static Tesla getInstance() {
        if (instance==null)
            instance = new Tesla(); //Create only one Tesla Object
        return instance;
    }
    //END_SINGLETON

    @Override
    public void build() {
        System.out.println("Tesla builds a car");
    }

    @Override
    public void repair() {
        System.out.println("Tesla repairs a car");
    }

    @Override
    public void restore() {
        System.out.println("Tesla restores a car");
    }
}
