import java.lang.Math;
/**
 * 
 */

/**
 * @author bakto
 *
 */
public class Competition extends Swap {
	private Competition comp;
	private Trainer sieger, verlierer;
	private Pokemon verpok,siegpok;
	
	public void setComp(Competition comp) {
		this.comp=comp;
	}
	/**
	 * @return the comp
	 */
	public Competition getComp() {
		return comp;
	}
	public double TypeConvert(Pokemon pokemon){
		if(pokemon.getType()==Type.fire) {
			return 3*Math.random();
		} else if(pokemon.getType()==Type.poison) {
			return 2*Math.random();
		}else {
			return 1*Math.random();
		}
	}
	/**
	 * 
	 */
	public Competition(Trainer trainer1,Trainer trainer2 , Pokemon pokemon1, Pokemon pokemon2) {
		super();
		
		double trainer1score=Math.random()*TypeConvert(pokemon1)*100;
		double trainer2score=Math.random()*TypeConvert(pokemon2)*100;
		if(trainer1score>trainer2score) {
		sieger= trainer1;
		siegpok=pokemon1;
		verlierer=trainer2;
		verpok=pokemon2;
		}else {
			sieger= trainer2;
			siegpok=pokemon2;
			verlierer=trainer1;
			verpok=pokemon1;
		}
		this.execute(sieger,verlierer, siegpok, verpok);
		addComps();
		System.out.println(Math.random());
		
		
	}
	public void execute(Trainer trainer1,Trainer trainer2 , Pokemon pokemon1, Pokemon pokemon2) {
		if(trainer1 == trainer2  ) {
			System.out.println("Gleicher Trainer!");
		} else if(pokemon1.swapAllow==false || pokemon2.swapAllow == false  ){
			System.out.println("Pokemon " + pokemon1.getName()+" oder "+pokemon2.getName()+" ist untauschbar");		
			}else if(pokemon1.getType() == pokemon2.getType() ) {
				System.out.println("Pokemon Typen sind gleich: " + pokemon1.getType());
				}else {
				
					trainer2.poks.remove(pokemon2);
					trainer1.poks.add(pokemon2);
					
			}
	}
	public static Competition doComp(Trainer trainer1,Trainer trainer2, Pokemon pokemon1, Pokemon pokemon2) { 
		return new Competition( trainer1, trainer2,  pokemon1,  pokemon2);
	}

	
	public void addComps() {
		Pokemon.comps.add(this.comp);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
