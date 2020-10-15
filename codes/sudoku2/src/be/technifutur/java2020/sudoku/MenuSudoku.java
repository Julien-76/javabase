package be.technifutur.java2020.sudoku;
import be.technifutur.java2020.sudoku.sudoku4x4.Sudoku4x4;
import be.technifutur.java2020.sudoku.sudoku9x9.Sudoku9x9;
import be.technifutur.java2020.sudoku.sudokuEtoile.SudokuEtoile;

import java.util.Scanner;

public class MenuSudoku {
    int choice = 0;
    Sudoku sudoku4 = new Sudoku4x4();
    Sudoku sudoku9 = new Sudoku9x9();
    Sudoku sudokuE = new SudokuEtoile();

    public void afficheMenu(){
        int choix;
        System.out.println("Choisi ton sudoku\n1. 4X4\n2. 9X9\n3. Etoile");
        Scanner sc = new Scanner(System.in);
        choix = sc.nextInt();
        while (choix != 1 && choix != 2 && choix != 3){
            System.out.println("Choix incorrect");
            System.out.println("Choisi ton sudoku\n1. 4X4\n2. 9X9\n3. Etoile");
            choix = sc.nextInt();
        }
        this.choice = choix;
    }

    public void choiceSudoku(){
        if (this.choice == 1){
            sudoku4.presenteGrilleVide();
            sudoku4.afficheGrilleVide();
        }
        else if (this.choice == 2){
            sudoku9.presenteGrilleVide();
            sudoku9.afficheGrilleVide();
        } else {
            sudokuE.presenteGrilleVide();
            sudokuE.afficheGrilleVide();
        }
    }
}
