
/*
* Classname Pokemon
*
 * Version 1.0
 * 
 * Copyright MIT
 */

import java.util.ArrayList;

/**
 * @author Tobias Bak.
 *
 */

public class Pokemon {
  public static ArrayList<Swap> swaps = new ArrayList<Swap>(); // Tauschliste
  public static ArrayList<Competition> comps = new ArrayList<Competition>();
  private String name;// Variable die Pokemonname speichert
  private Type type; // Variable die Pokemontyp speichert
  private int number; // Variable die Pokemonnummer speichert
  private static int nextnumber = 1;// globale Variable die nächste Pokemonnummer statisch speichert
  private Trainer trainer;
  public boolean swapAllow;

  /**
   * @return.
   */
  public boolean isSwapAllow() {
    return swapAllow;
  }

  /**
   * @param swapAllow the swapAllow to set.
   */
  public void setSwapAllow(boolean swapAllow) {
    this.swapAllow = swapAllow;
  }

  /**
   * @return.
   */
  public String getName() {
    return name;
  }

  /**
   * @param.
   *          the name to set.
   */
  public void setName(String name) {
    this.name = name; //
    /**
     * Effektiv nutzt man es für mehrere Dinge: sicherstellen, dass man ein ganzes Feld anspricht
     * wenn es doppelt bennenung gibt bezug auf das aktuelle Objekt als Ganzes andere Konstruktoren
     * in eigenem aufrufen
     */
  }

  /**
   * @return.
   */
  public Type getType() {
    return type;
  }

  /**
   * @param type the type to set.
   */
  public void setType(Type type) {
    this.type = type;
  }

  /**
   * @return.
   */
  public Trainer getTrainer() {
    return trainer;
  }

  /**
   * @param.
   *          the trainer to set.
   */
  public void setTrainer(Trainer trainer) {
    this.trainer = trainer;
  }

  /**
   * @setNumber() fortlaufende Nummer eines Pokemons.
   */
  public void setNumber() {
    this.number = nextnumber;
    nextnumber++;
  }
  /**
   * @Pokemon.
   */
  
  public Pokemon(String name, Type type) {
    setName(name);
    setType(type);
    setNumber();
    setSwapAllow(true);
    // Auto-generated constructor stub
  }

  /**
   * @tostring() Gibt Nr, Name, Typ aufrufenden Pokemons.
   */
  public void tostring() {
    System.out.println("Nr: " + this.number + " Name: " + this.name + " Typ: " + this.type);
  }

  public static void main(String[] args) {

  }

}
