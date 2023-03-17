public class Airbus implements Airplane{
    @Override
    public void build() {
        System.out.println("Airbus builds an airplane");
    }

    @Override
    public void repair() {
        System.out.println("Airbus repairs an airplane");
    }

    @Override
    public void restore() {
        System.out.println("Airbus restores an airplane");
    }
}
