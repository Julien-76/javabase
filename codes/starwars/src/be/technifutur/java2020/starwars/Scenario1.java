package be.technifutur.java2020.starwars;
import java.util.Scanner;

public class Scenario1{
	public void run(){
		int ordre, vaisseauxEnVol = 0;
		Vaisseaux corvus = new Vaisseaux();


		corvus.name = "Corvus";
		System.out.println("Combien de missile(s) charge-t-on ?");
		Scanner sc = new Scanner(System.in);
		corvus.nbreMissiles = sc.nextInt();
		System.out.println("\n Attention, on tire ! ! ! \n");
		corvus.tirer();
		VaisseauBlinde vuscor = new VaisseauBlinde();
		VaisseauBlinde vuscor2 = new VaisseauBlinde();
		VaisseauBlinde vuscor3 = new VaisseauBlinde();
		VaisseauBlinde vuscor4 = new VaisseauBlinde();
		VaisseauBlinde vuscor5 = new VaisseauBlinde();

		vuscor.vaisseauVol(ordre, vaisseauxEnVol);
		vuscor2.vaisseauVol(ordre, vaisseauxEnVol);
		vuscor3.vaisseauVol(ordre, vaisseauxEnVol);
		vuscor4.vaisseauVol(ordre, vaisseauxEnVol);
		vuscor5.vaisseauVol(ordre, vaisseauxEnVol);

		System.out.println("Il y a " + vaisseauxEnVol + " vaisseaux en vol");
	}

}