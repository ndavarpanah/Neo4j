public class Dominos implements Pizza{

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
    private Dominos(Dominos.Builder add){
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
        System.out.println("Dominos - size: " + pizzaSize.name() + " with toppings:");
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


    //Inner Class - must be static as we will call it before Dominos is built
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

        public Dominos.Builder addPepperoni() {
            this.pepperoni = true;
            return this;
        }

        public Dominos.Builder addSausage() {
            this.sausage = true;
            return this;
        }

        public Dominos.Builder addMushrooms() {
            this.mushrooms = true;
            return this;
        }

        public Dominos.Builder addBacon() {
            this.bacon = true;
            return this;
        }

        public Dominos.Builder addOnions() {
            this.onions = true;
            return this;
        }

        public Dominos.Builder addExtraCheese() {
            this.extraCheese = true;
            return this;
        }

        public Dominos.Builder addPeppers() {
            this.peppers = true;
            return this;
        }

        public Dominos.Builder addChicken() {
            this.chicken = true;
            return this;
        }

        public Dominos.Builder addOlives() {
            this.olives = true;
            return this;
        }

        public Dominos.Builder addSpinach() {
            this.spinach = true;
            return this;
        }

        public Dominos.Builder addTomatoAndBasil() {
            this.tomatoAndBasil = true;
            return this;
        }

        public Dominos.Builder addBeef() {
            this.beef = true;
            return this;
        }

        public Dominos.Builder addHam() {
            this.ham = true;
            return this;
        }

        public Dominos.Builder addPesto() {
            this.pesto = true;
            return this;
        }

        public Dominos.Builder addSpicyPork() {
            this.spicyPork = true;
            return this;
        }

        public Dominos.Builder addHamAndPineapple() {
            this.hamAndPineapple = true;
            return this;
        }

        public Dominos build(){
            return new Dominos(this);  //Pass all optional fields
        }
    }
}
