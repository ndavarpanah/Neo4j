public class Bertram implements Boat{
    @Override
    public void build() {
        System.out.println("Bertram builds a boat");
    }

    @Override
    public void repair() {
        System.out.println("Bertram repairs a boat");
    }

    @Override
    public void restore() {
        System.out.println("Bertram restores a boat");
    }
}
