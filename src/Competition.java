/*
* Classname Competition
*
 * Version 1.0
 * 
 * Copyright MIT
 */

import java.lang.Math;

/**
 * @author bakto.
 *
 */
public class Competition extends Swap {
  private Competition comp;
  
  private Trainer sieger;
  
  private Trainer verlierer;
  
  private Pokemon verpok;
  
  private Pokemon siegpok;
  
  public void setComp(Competition comp) {
    this.comp = comp;
  }
  /**
  * @return .
  */
  
  public Competition getComp() {
    return comp;
  }

  /**
   * @TypeConvert.
   */
  
  public double typeConvert(Pokemon pokemon) {
    if (pokemon.getType() == Type.fire) {
      return 3 * Math.random();
    } else if (pokemon.getType() == Type.poison) {
      return 2 * Math.random();
    } else {
      return 1 * Math.random();
    }
  }
  
  /**
  * .
  */
  
  public Competition(Trainer trainer1,Trainer trainer2 , Pokemon pokemon1, Pokemon pokemon2) {
    super();
    double trainer1score = Math.random() * typeConvert(pokemon1) * 1000;
    double trainer2score = Math.random() * typeConvert(pokemon2) * 1000;
    if (trainer1score > trainer2score) {
      sieger = trainer1;
      siegpok = pokemon1;
      verlierer = trainer2;
      verpok = pokemon2;
    } else {
      sieger = trainer2;
      siegpok = pokemon2;
      verlierer = trainer1;
      verpok = pokemon1;
    }
    this.execute(sieger,verlierer, siegpok, verpok);
    addComps();
    //System.out.println(Math.random());
  }
  
  /**
  * @see Swap#execute(Trainer, Trainer, Pokemon, Pokemon).
  */
  
  public void execute(Trainer trainer1,Trainer trainer2 , Pokemon pokemon1, Pokemon pokemon2) {
    if (trainer1 == trainer2) {
      System.out.println("Gleicher Trainer!");
    } else if (pokemon1.swapAllow == false || pokemon2.swapAllow == false) {
      System.out.println("Pokemon " + pokemon1.getName()
          + " oder " + pokemon2.getName() + " ist untauschbar");
    } else if (pokemon1.getType() == pokemon2.getType()) {
      System.out.println("Pokemon Typen sind gleich: " + pokemon1.getType());
    } else {
      trainer2.poks.remove(pokemon2);
      trainer1.poks.add(pokemon2);
    }
  }
  
  public static Competition doComp(Trainer trainer1, Trainer trainer2,
      Pokemon pokemon1, Pokemon pokemon2) { 
    return new Competition(trainer1, trainer2,  pokemon1,  pokemon2);
  }

  /**
  * @addComps().
  */

  public void addComps() {
    Pokemon.comps.add(this.comp);
  }
  
  /**
  * @main do nothing.
  */
  public static void main(String[] args) {
    // do nothing in main
  }

}
