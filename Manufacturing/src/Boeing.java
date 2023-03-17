public class Boeing implements Airplane{
    @Override
    public void build() {
        System.out.println("Boeing builds an airplane");
    }

    @Override
    public void repair() {
        System.out.println("Boeing repairs an airplane");
    }

    @Override
    public void restore() {
        System.out.println("Boeing restores an airplane");
    }
}