package be.technifutur.java2020.starwars;
import java.util.Scanner;

public class Main{

	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		Scenario1 histoire = new Scenario1();
		histoire.run();
		System.out.println("");
		System.out.println("Que la force de la POO soit avec toi jeune Padawan!");
	}
}