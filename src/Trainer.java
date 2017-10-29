/**
* Classname Trainer
*
 * Version 1.0
 * @author Tobias Bak
 * Copyright MIT
 */

import java.util.ArrayList;

public class Trainer {
  
  /**
   * @class. Trainer gets (String,String).
   */
  
  private String firstname;//Variable die Trainer Vorname speichert
  private String lastname;  //Variable die Trainer Nachname speichert
  public ArrayList<Pokemon> poks = new ArrayList<Pokemon>(); //Liste von Pokemons
  
  /**
   *. 
   */
  
  public void addPokemon(Pokemon pokemon) {
    this.poks.add(pokemon);
  }
  
  /**
   * @return; the firstname.
   */
  
  public void deletePokemon(Pokemon pokemon) {
    this.poks.remove(pokemon);
  }
  /**
   * @return. the firstname.
   */
  
  public String getFirstname() {
    return firstname;
  }

  /**
   * @param. firstname the firstname to set.
   */
  
  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  /**
   * @return. the lastname.
   */
  
  public String getLastname() {
    return lastname;
  }

  /**
   * @param. lastname the lastname to set.
   */
  
  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  /**
   * @param. args.
   */
  
  public Trainer(String firstname, String lastname) {
    setFirstname(firstname);
    setLastname(lastname);
    // Auto-generated constructor stub
  }

  /**
   * @param. args.
   */
  
  public static void main(String[] args) {
    //  Auto-generated method stub
  }

}
