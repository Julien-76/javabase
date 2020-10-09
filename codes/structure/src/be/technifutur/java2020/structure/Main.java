package be.technifutur.java2020.structure;

public class Main{
	
	public static void main(String... args){
		
		Pile maPile = new Pile();
		Pile maPile2 = new Pile();
		int a = 10;
		for (int cpt = 0; cpt < 6; cpt++){
			if (cpt < 5){
				maPile.suivant = new Pile();
			}
			maPile.valeur = a;
			a = a + 10;
			System.out.println(maPile.valeur);
			maPile = maPile.suivant;
		}



	}


	public static Pile fusion(Pile a, Pile b){
		Pile pileFusion = new Pile();
		while (a.suivant != null){
			a = a.suivant;
		}
		a.suivant = b;
		return a;
	}


	public static int taille(Pile p){
		int cpt = 1;
		while (p.suivant != null){
			cpt++;
			p = p.suivant;
		}
		return cpt;
	}

	public static Pile add(Pile p, int val){
		Pile newPile = new Pile();
		newPile.valeur = val;
		newPile.suivant = p;
		return newPile;
	}

	public static int read(int place, Pile p){
		int val;
		for(int cpt = 1; cpt < place; cpt++){
			p = p.suivant;
		}
		val = p.valeur;
		return val;
	}
	
}