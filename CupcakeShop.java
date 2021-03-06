package lab1;

/**
 * This is our top-level class that represents a CupcakeShop!
 */
import cs15.labs.cupcakeSupport.CS15Cupcake;

public class CupcakeShop {

    public CupcakeShop() {
        // Instantiates an instance of our baker as a local variable
        Baker baker = new Baker();
        CS15Cupcake cupcake = baker.bakeCupcake();
        Decorator decorator = new Decorator(cupcake);
        decorator.addCherry();
        Froster froster = new Froster(cupcake);
        froster.addFrosting();
    }
}
