public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Pizza firstPizza = new PizzaHut.Builder(Size.SMALL).addBacon().addOlives().build();
        Pizza secondPizza = new PizzaHut.Builder(Size.LARGE).addExtraCheese().build();
        Pizza thirdPizza = new Dominos.Builder(Size.MEDIUM).addMushrooms().build();

        firstPizza.eat();
        secondPizza.eat();
        thirdPizza.eat();


    }
}