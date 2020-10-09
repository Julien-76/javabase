package be.technifutur.java2020.starwars;

public class Vaisseaux{
	public String name;
	public int nbreMissiles;
	public int a = 0;

	public void tirer(){
		while (this.nbreMissiles != 0){
			System.out.println("PAN ! ! ");
			this.nbreMissiles--;
		}
		System.out.println("pouf...");
	}
}