public class SeaRay implements Boat{
    @Override
    public void build() {
        System.out.println("SeaRay builds a boat");
    }

    @Override
    public void repair() {
        System.out.println("SeaRay repairs a boat");
    }

    @Override
    public void restore() {
        System.out.println("SeaRay restores a boat");
    }
}
