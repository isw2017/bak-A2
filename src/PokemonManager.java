/*
 * Classname PokemonManager
 *
 * Version 1.0
 * 
 * Copyright MIT
 */

/**
 * @author Tobias Bak.
 *
 */
public class PokemonManager {
  /**
   *  @makeTrainer Methode zur erstellung eines neues Trainers.
   *  @return gibt ein neues Objekt der Klasse Trainer zurück.  
   */

  public static Swap doSwap(Trainer trainer1,Trainer trainer2,
      Pokemon pokemon1, Pokemon pokemon2) { 
    return new Swap(trainer1, trainer2,  pokemon1,  pokemon2);
  }
  /**
   *  @return .  
   */

  
  public static Competition doFight(Trainer trainer1,Trainer trainer2,
      Pokemon pokemon1, Pokemon pokemon2) { 
    return new Competition(trainer1, trainer2,  pokemon1,  pokemon2);
  }


  /**
   *  @makeTrainer Methode zur erstellung eines neues Trainers.
   *  @return gibt ein neues Objekt der Klasse Trainer zurück.  
   */

  public static Trainer makeTrainer(String firstname, String lastname) { 
    return new Trainer(firstname,lastname);
  }
  /**
   *  @makePokemon Methode zur erstellung eines neues Pokemons.
   *  @return gibt ein neues Objekt der Klasse Pokemon zurück.  
   */
  
  public static Pokemon makePokemon(String name, Type type) {
    return new Pokemon(name, type);
  }
  /**
   *  @matchTrainer Methode die ein Pokemon zu einen Trainer zu ordnet.  
   *  @return. void Methode verändert den Listenparameter poks des Objekts Trainer (trainer.poks).  
   */
  
  public static void matchTrainer(Trainer trainer, Pokemon pokemon) {
    trainer.addPokemon(pokemon);
  }

  /**
   *  @showPokemon Methode zur ausgabe Pokemons mit Nummer int number vom Objekt Trainer.
   *  @return. void Methode liest den Listenparameter poks des Objekts Trainer (trainer.poks).  
   */
  public static void showPokemon(Trainer trainer, int number) {
    trainer.poks.get(number - 1).tostring(); // gibt das Pokemon an der 0ten stelle aus
  }

  /**
   *  @showAllPokemon Methode zur ausgabe aller Pokemons vom Objekt Trainer.
   *  @return. void Methode liest den Listenparameter poks des Objekts Trainer (trainer.poks).  
   */

  public static void showAllPokemon(Trainer trainer) {
    for (int i = 0;i < trainer.poks.size(); i++) { 
      trainer.poks.get(i).tostring(); 
    }
  }

  /**
   *  @showAllTypePokemon Methode zur ausgabe Pokemons eines typs vom Objekt Trainer.
   *  @return. void Methode liest den Listenparameter poks des Objekts Trainer (trainer.poks).  
   */

  public static void showAllTypePokemon(Trainer trainer,Type type) {
    for (int i = 0; i < trainer.poks.size();i++) {
      if (trainer.poks.get(i).getType() == type) {
        trainer.poks.get(i).tostring(); 
      }
    }
  }

  /**
   *  @main. 
   *   
   */


  public static void main(String[] args) {
    Pokemon pokemon1 = makePokemon("Pikachu",Type.poison) ;
    Pokemon pokemon2 = makePokemon("Dragoran",Type.water);
    Pokemon pokemon3 = makePokemon("Dragoran2",Type.fire) ;
    //Tobis Pokemons
    Trainer trainer1 = makeTrainer("Tobi","Bak");
    PokemonManager.matchTrainer(trainer1,pokemon1);
    PokemonManager.matchTrainer(trainer1,pokemon2);
    PokemonManager.matchTrainer(trainer1,pokemon3);
    //Nicos Pokemons
    Trainer trainer2 = makeTrainer("Nico","Champ");
    Pokemon pokemon4 = makePokemon("Glurak",Type.fire) ;
    Pokemon pokemon5 = makePokemon("Mewtu",Type.poison);
    Pokemon pokemon6 = makePokemon("Zapdos",Type.water) ;
    PokemonManager.matchTrainer(trainer2,pokemon4);
    PokemonManager.matchTrainer(trainer2,pokemon5);
    PokemonManager.matchTrainer(trainer2,pokemon6);
    // Ausgaben
    /*System.out.println("Nicos alle Pokemons:");
    showAllPokemon(trainer2);
    System.out.println("Tobis alle Pokemons:");
    showAllPokemon(trainer1);*/

    doSwap(trainer1,trainer1,pokemon1,pokemon2);
    doSwap(trainer1,trainer2,pokemon3,pokemon4);
    pokemon4.setSwapAllow(false);
    doSwap(trainer1,trainer2,pokemon2,pokemon4);
    pokemon4.setSwapAllow(true);
    //doSwap(trainer1,trainer2,pokemon2,pokemon4);
    doFight(trainer1,trainer2,pokemon2,pokemon4);

    System.out.println("Nicos alle Pokemons nach dem swap:");
    showAllPokemon(trainer2);
    System.out.println("Tobis alle Pokemons nach dem swap:");
    showAllPokemon(trainer1); 
  }

}
