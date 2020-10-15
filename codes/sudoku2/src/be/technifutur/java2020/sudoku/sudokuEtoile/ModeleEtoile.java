package be.technifutur.java2020.sudoku.sudokuEtoile;
import java.util.Scanner;

public class ModeleEtoile {

    char[][] grille = new char[21][21];

    public void setValue(char value, int ligne, int colonne){
        grille[ligne-1][colonne-1] = value;
    }

    public char getValue(int ligne, int colonne){
        return grille[ligne][colonne];
    }

    public void testaffichageEtoile(){

        char[][] tabTest = new char[21][21];
        boolean valid;
        int ligne, colonne;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ligne ?");
        ligne = sc.nextInt();
        System.out.println("Colonne ?");
        colonne = sc.nextInt();
        ligne--;
        colonne--;
        char val = 'X';
        tabTest[ligne][colonne] = val;
        if (8 < colonne && colonne < 12 && -1 < ligne && ligne < 6 || -1 < colonne && colonne < 6 && 8 < ligne && ligne < 12
                || 14 < colonne && colonne < 21 && 8 < ligne && ligne < 12 || 8 < colonne && colonne < 12 && 14 < ligne && ligne < 21){
            System.out.println("Plouf");
        }
        for(int cpt = 0; cpt < 21; cpt ++){
            for(int cpt2 = 0; cpt2 < 21; cpt2++){
                if (8 < cpt2 && cpt2 < 12  && cpt < 6 ||  cpt2 < 6 && 8 < cpt && cpt < 12 || 14 < cpt2 && 8 < cpt && cpt < 12 || 8 < cpt2 && cpt2 < 12 && 14 < cpt ){
                    System.out.print(" \t");
                } else {
                    if (tabTest[cpt][cpt2] == 0 && !(8 < cpt2 && cpt2 < 12 && cpt < 6 ||  cpt2 < 6 && 8 < cpt && cpt < 12
                            || 14 < cpt2 && cpt2 < 21 && 8 < cpt && cpt < 12 || 8 < cpt2 && cpt2 < 12 && 14 < cpt )) {
                        System.out.print("*\t");
                    }
                    if (tabTest[cpt][cpt2] == tabTest[ligne][colonne]) {
                        System.out.print(val + "\t");
                    }


                    }
                if (cpt2 == 20) {
                    System.out.print("\n");
                }
            }
        }




        /* boolean valide;
        int ligne, colonne;
        char[][] tabEtoile = new char[21][21];
        System.out.println("Entre la ligne et la colonne, je te dirai si c'est une position valide ou pas");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ligne :");
        ligne = sc.nextInt();
        System.out.println("Colonne :");
        colonne = sc.nextInt();
        if (9 < colonne && colonne < 13 && 0 < ligne && ligne < 7 || 0 < colonne && colonne < 7 && 9 < ligne && ligne < 13
          || 15 < colonne && colonne < 22 && 9 < ligne && ligne < 13 || 9 < colonne && colonne < 13 && 15 < ligne && ligne < 22){
            System.out.println("Position invalide");
        }   else {
            System.out.println("Position valide");
             } */
    }

    public static void main(String[] args) {
        ModeleEtoile baba = new ModeleEtoile();
        baba.testaffichageEtoile();
    }

}
