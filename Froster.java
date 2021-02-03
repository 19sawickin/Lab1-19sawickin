package lab1;

import cs15.labs.cupcakeSupport.CS15Cupcake;
import cs15.labs.cupcakeSupport.CS15Frosting;

public class Froster {
    private CS15Cupcake _cupcake;
    private CS15Frosting _frosting;

    public Froster(CS15Cupcake cupcake) {
        _cupcake = cupcake;
    }

    public void addFrosting(){
        _frosting = new CS15Frosting();
        _cupcake.spreadFrosting(_frosting);
    }

}
