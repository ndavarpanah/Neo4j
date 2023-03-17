public class Embraer implements Airplane{
    @Override
    public void build() {
        System.out.println("Embraer builds an airplane");
    }

    @Override
    public void repair() {
        System.out.println("Embraer repairs an airplane");
    }

    @Override
    public void restore() {
        System.out.println("Embraer restores an airplane");
    }
}