package be.technifutur.java2020.sudoku.sudoku9x9;

public class Modele9x9 {

    char[][] grille = new char[9][9];

    public void setValue(char value, int ligne, int colonne){
        grille[ligne-1][colonne-1] = value;
    }

    public char getValue(int ligne, int colonne){
        return grille[ligne][colonne];
    }
}
