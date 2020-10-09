package be.technifutur.java2020.projethello;

public class Hello{
	
	public static void main(String[] args) {
		int a = 5;
		double b = 5.5;
		boolean f = true;
		String texte = "toto";

		a = a + 1;

		if ( args.length > 0)			// si longueur(args) > 0 alors
			{
				System.out.println("plus grand que 0");
			}
		else
			{
				System.out.println("pas plus grand");
			}				
		System.out.println("Hello l'été ????!! $$€");
	}
}