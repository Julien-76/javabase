package be.technifutur.java2020.sudoku.sudoku4x4;


public class Modele4x4 {
    char[][] grille = new char[4][4];

    public void setValue(char value, int ligne, int colonne){
        grille[ligne-1][colonne-1] = value;
    }

    public char getValue(int ligne, int colonne){
        return grille[ligne][colonne];
    }

}
