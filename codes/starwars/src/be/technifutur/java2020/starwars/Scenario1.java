package be.technifutur.java2020.starwars;
import java.util.Scanner;

public class Scenario1{
	public void run(){
		int ordre;
		Vaisseaux corvus = new Vaisseaux();
		VaisseauBlinde vuscor = new VaisseauBlinde("Vuscor");
		System.out.println("Voici le nom du vaisseau blindé : " + vuscor.getName());
		corvus.name = "Corvus";
		System.out.println("Combien de missile(s) charge-t-on ?");
		Scanner sc = new Scanner(System.in);
		corvus.nbreMissiles = sc.nextInt();
		System.out.println("\n Attention, on tire ! ! ! \n");
		corvus.tirer();
		System.out.println("Quel ordre donner ? \n1. Décoller\n2. Atterrir");
		ordre =sc.nextInt();
		if (ordre == 1){
			vuscor.decollage();
		}
		else {
			vuscor.atterrissage();
		}






	}
}