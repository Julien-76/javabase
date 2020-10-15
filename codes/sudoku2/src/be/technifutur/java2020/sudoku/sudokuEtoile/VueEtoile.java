package be.technifutur.java2020.sudoku.sudokuEtoile;

import be.technifutur.java2020.sudoku.sudoku9x9.Modele9x9;

public class VueEtoile {

    private ModeleEtoile modele;

    public void setModele(ModeleEtoile monSudoku) {
        this.modele = monSudoku;
    }
    public void afficheGrilleEtoile() {

        for (int cpt = 0; cpt < 21; cpt++) {
            for (int cpt2 = 0; cpt2 < 21; cpt2++) {
                if (8 < cpt2 && cpt2 < 12 && cpt < 6 || cpt2 < 6 && 8 < cpt && cpt < 12 || 14 < cpt2 && 8 < cpt && cpt < 12 || 8 < cpt2 && cpt2 < 12 && 14 < cpt) {
                    System.out.print(" \t");
                } else {
                    if (modele.grille[cpt][cpt2] == 0 && !(8 < cpt2 && cpt2 < 12 && cpt < 6 || cpt2 < 6 && 8 < cpt && cpt < 12
                            || 14 < cpt2 && cpt2 < 21 && 8 < cpt && cpt < 12 || 8 < cpt2 && cpt2 < 12 && 14 < cpt)) {
                        System.out.print("*\t");
                    }
                    if (modele.grille[cpt][cpt2] != 0) {
                        System.out.print(modele.grille[cpt][cpt2]);
                    }


                }
                if (cpt2 == 20) {
                    System.out.print("\n");
                }
            }
        }
    }
}
