import java.lang.reflect.*;     //Needed for Field
public class PizzaHut implements Pizza{

    private Size pizzaSize; //Mandatory field
    private boolean pepperoni;
    private boolean sausage;
    private boolean mushrooms;
    private boolean bacon;
    private boolean onions;
    private boolean extraCheese;
    private boolean peppers;
    private boolean chicken;
    private boolean olives;
    private boolean spinach;
    private boolean tomatoAndBasil;
    private boolean beef;
    private boolean ham;
    private boolean pesto;
    private boolean spicyPork;
    private boolean hamAndPineapple;

    //PRIVATE CONSTRUCTOR
    private PizzaHut(Builder add){
        pizzaSize = add.pizzaSize;
        pepperoni = add.pepperoni;
        sausage = add.sausage;
        mushrooms = add.mushrooms;
        bacon = add.bacon;
        onions = add.onions;
        extraCheese = add.extraCheese;
        peppers = add.peppers;
        chicken = add.chicken;
        olives = add.olives;
        spinach = add.spinach;
        tomatoAndBasil = add.tomatoAndBasil;
        beef = add.beef;
        ham = add.ham;
        pesto = add.pesto;
        spicyPork = add.spicyPork;
        hamAndPineapple = add.hamAndPineapple;
    }

    @Override
    public void eat() {
        System.out.print("null");
        System.out.println("PizzaHut - size: " + pizzaSize.name() + " with toppings:");
        if (pepperoni) { System.out.println( "pepperoni " );}
        if (sausage) { System.out.println( "sausage " );}
        if (mushrooms) { System.out.println( "mushrooms " );}
        if (bacon) { System.out.println( "bacon " );}
        if (onions) { System.out.println( "onions " );}
        if (extraCheese) { System.out.println( "extraCheese " );}
        if (chicken) { System.out.println( "chicken " );}
        if (olives) { System.out.println( "olives " );}
        if (spinach) { System.out.println( "spinach " );}
        if (tomatoAndBasil) { System.out.println( "tomatoAndBasil " );}
        if (beef) { System.out.println( "beef " );}
        if (ham) { System.out.println( "ham " );}
        if (pesto) { System.out.println( "pesto " );}
        if (spicyPork) { System.out.println( "spicyPork " );}
        if (hamAndPineapple) { System.out.println( "hamAndPineapple " );}
    }


    //Inner Class - must be static as we will call it before PizzaHut is built
    public static class Builder {
        //Mandatory field
        private final Size pizzaSize;

        //Optional fields
        private boolean pepperoni;
        private boolean sausage;
        private boolean mushrooms;
        private boolean bacon;
        private boolean onions;
        private boolean extraCheese;
        private boolean peppers;
        private boolean chicken;
        private boolean olives;
        private boolean spinach;
        private boolean tomatoAndBasil;
        private boolean beef;
        private boolean ham;
        private boolean pesto;
        private boolean spicyPork;
        private boolean hamAndPineapple;

        //PUBLIC CONSTRUCTOR
        public Builder(Size pizzaSize){
            this.pizzaSize = pizzaSize;     //Mandatory field
        }

        public Builder addPepperoni() {
            this.pepperoni = true;
            return this;
        }

        public Builder addSausage() {
            this.sausage = true;
            return this;
        }

        public Builder addMushrooms() {
            this.mushrooms = true;
            return this;
        }

        public Builder addBacon() {
            this.bacon = true;
            return this;
        }

        public Builder addOnions() {
            this.onions = true;
            return this;
        }

        public Builder addExtraCheese() {
            this.extraCheese = true;
            return this;
        }

        public Builder addPeppers() {
            this.peppers = true;
            return this;
        }

        public Builder addChicken() {
            this.chicken = true;
            return this;
        }

        public Builder addOlives() {
            this.olives = true;
            return this;
        }

        public Builder addSpinach() {
            this.spinach = true;
            return this;
        }

        public Builder addTomatoAndBasil() {
            this.tomatoAndBasil = true;
            return this;
        }

        public Builder addBeef() {
            this.beef = true;
            return this;
        }

        public Builder addHam() {
            this.ham = true;
            return this;
        }

        public Builder addPesto() {
            this.pesto = true;
            return this;
        }

        public Builder addSpicyPork() {
            this.spicyPork = true;
            return this;
        }

        public Builder addHamAndPineapple() {
            this.hamAndPineapple = true;
            return this;
        }

        public PizzaHut build(){
            return new PizzaHut(this);  //Pass all optional fields
        }
    }
}
