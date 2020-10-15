package be.technifutur.java2020.sudoku.sudoku4x4;

public class Vue4x4 {

    private Modele4x4 modele;


    public void setModele(Modele4x4 monSudoku){
        this.modele = monSudoku;
    }
    public void afficheGrilleVide(){
        System.out.println("*\t*\t*\t*\n*\t*\t*\t*\n*\t*\t*\t*\n*\t*\t*\t*\n");
    }

    public void afficheGrille(){
        for(int cpt = 0; cpt < 4; cpt++) {
            for (int cpt2 = 0; cpt2 < 4; cpt2++) {
                if (modele.grille[cpt][cpt2] == 0){
                    System.out.print("*" + "\t");
                }   else {
                    System.out.print(modele.grille[cpt][cpt2] + "\t");
                    }
                if (cpt2 == 3) {
                    System.out.println("\n");
                }
            }
        }

    }


    public static void main(String[] args) {



       Vue4x4 testVue = new Vue4x4();
        Modele4x4 testModele = new Modele4x4();
        testModele.setValue('R', 3, 1);
        System.out.println("Voici la grille vide :\n");
        testVue.afficheGrilleVide();
        testVue.setModele(testModele);
        System.out.println("Et voici la grille avec le caractère :\n");
        testVue.afficheGrille();

    }
}
