public class Mastercraft implements Boat{
    @Override
    public void build() {
        System.out.println("Mastercraft builds a boat");
    }

    @Override
    public void repair() {
        System.out.println("Mastercraft repairs a boat");
    }

    @Override
    public void restore() {
        System.out.println("Mastercraft restores a boat");
    }
}
