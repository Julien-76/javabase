package be.technifutur.java2020.starwars;

public class VaisseauBlinde{
	private String name = "sans nom";
	private int nbreMissiles;
	private boolean vol = true;

	public VaisseauBlinde(String name){
		super();
		this.setName(name);
	}

	public void setName(String name){
		if (name != null && name.length() > 0){
			this.name = name;
		}
	}

	public String getName(){
		return this.name;
	}


	public void tirer(){
		while (this.nbreMissiles != 0){
			System.out.println("PAN ! !");
			this.nbreMissiles--;
		}
		System.out.println("pouf...");
	}
	public void addMissile(int nb){
		if (nb > 0){
			if(nb + this.nbreMissiles > 20){
				this.nbreMissiles = 20; 
			} else {
				this.nbreMissiles += nb;
			}
		}
	}
	public void decollage(){
		if (this.vol){
			System.out.println("Je suis déjà en vol...");
			} else {
				System.out.println("C'est parti pour le décollage ! !");
				this.vol = true;
			}
	}
	public void atterrissage(){
		if (this.vol){
			System.out.println("Ok capitaine, on atterri !");
			this.vol = false;
		}
		else {
			System.out.println("Je suis déjà à terre...");
		}




















	}

}