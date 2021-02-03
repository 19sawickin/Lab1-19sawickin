package lab1;

// We've already added some imports for you here!
import cs15.labs.cupcakeSupport.CS15Cupcake;
import cs15.labs.cupcakeSupport.CS15Sprinkle;
import cs15.labs.cupcakeSupport.CS15Cherry;
import cs15.labs.cupcakeSupport.CupcakeDecoratorSupport;

/**
 * Don't worry about the 'extends' stuff - that just makes the click interaction
 * work! Pretend like it says 'public class CupcakeDecorator'.
 */
public class Decorator extends CupcakeDecoratorSupport {

  // This declares our instance variable _cupcake.
  private CS15Cupcake _cupcake;
  private CS15Cherry _cherry;

  /**
   * The constructor for CupcakeDecorator, which accepts a CS15Cupcake as a
   * parameter to set up *association*.
   */
  public Decorator(CS15Cupcake cupcake) {
    super();
    // Ignore (but DO NOT CHANGE) the line above!

    // This initializes our instance variable _cupcake.
    _cupcake = cupcake;
  }

  /**
   * You will NEVER need to call this method on your own. It will be called
   * anytime you click on the cupcake once this class is instantiated in App.java!
   */
  @Override
  public void addSprinkle(CS15Sprinkle sprinkle) {
    _cupcake.placeSprinkle(sprinkle);
    //TODO Add the sprinkle to the cupcake
  }

  public void addCherry(){
    _cherry = new CS15Cherry();
    _cupcake.placeCherryOnTop(_cherry);
  }

  //TODO Make a method to add a cherry below!
}
