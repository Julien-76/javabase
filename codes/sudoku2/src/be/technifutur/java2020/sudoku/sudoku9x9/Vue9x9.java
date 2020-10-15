package be.technifutur.java2020.sudoku.sudoku9x9;


public class Vue9x9 {

    private Modele9x9 modele;


    public void setModele(Modele9x9 monSudoku){
        this.modele = monSudoku;
    }
    public void afficheGrilleVide(){
        System.out.println("*\t*\t*\t*\t*\t*\t*\t*\t*\n*\t*\t*\t*\t*\t*\t*\t*\t*\n*\t*\t*\t*\t*\t*\t*\t*\t*");
        System.out.println("*\t*\t*\t*\t*\t*\t*\t*\t*\n*\t*\t*\t*\t*\t*\t*\t*\t*\n*\t*\t*\t*\t*\t*\t*\t*\t*");
        System.out.println("*\t*\t*\t*\t*\t*\t*\t*\t*\n*\t*\t*\t*\t*\t*\t*\t*\t*\n*\t*\t*\t*\t*\t*\t*\t*\t*");
    }

    public void afficheGrille(){
        for(int cpt = 0; cpt < 9; cpt++) {
            for (int cpt2 = 0; cpt2 < 9; cpt2++) {
                if (modele.grille[cpt][cpt2] == 0){
                    System.out.print("*" + "\t");
                }   else {
                    System.out.print(modele.grille[cpt][cpt2] + "\t");
                }
                if (cpt2 == 8) {
                    System.out.println("\n");
                }
            }
        }

    }

}
