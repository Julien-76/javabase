package be.technifutur.java2020.sudoku.sudoku9x9;


import java.util.Scanner;

public class Ctrl9x9 {


    int l, c;
    char v;
    boolean quit;
    String cmd;
    Vue9x9 ctVue;
    Modele9x9 ctModele;

    public void setModele(Modele9x9 peche) {
        this.ctModele = peche;
    }

    public void setVue(Vue9x9 poire){
        this.ctVue = poire;
    }

    public boolean testFin(){
        quit = this.v == 'Q';
        return quit;
    }


    public void valeurs(){
        String scan;
        System.out.println("Entre la ligne, la colonne et la valeur, séparés de points. Pour terminer, entre Q comme valeur");
        Scanner sc = new Scanner(System.in);
        scan = sc.nextLine();
        while (scan.length() > 5 || scan.charAt(1) != '.' || scan.charAt(3) != '.' || Character.getNumericValue(scan.charAt(0)) > 9 || Character.getNumericValue(scan.charAt(2)) > 9){
            System.out.println("Le choix ne respecte pas les conditions");
            System.out.println("Entre la ligne, la colonne et la valeur, séparés de points");
            scan = sc.nextLine();
        }
        this.cmd = scan;
    }


    public void inVariables(){
        this.l = Character.getNumericValue(cmd.charAt(0));
        this.c = Character.getNumericValue(cmd.charAt(2));
        this.v = cmd.charAt(4);
    }

    public static void main(String[] args) {
        Ctrl9x9 test = new Ctrl9x9();
        Vue9x9 ctrlVue = new Vue9x9();
        Modele9x9 ctrlMod = new Modele9x9();
        test.valeurs();
        test.inVariables();
        while (test.v != 'Q') {
            ctrlMod.setValue(test.v, test.l, test.c);
            System.out.println("Et voici la grille avec le caractère :\n");
            ctrlVue.setModele(ctrlMod);
            ctrlVue.afficheGrille();
            test.valeurs();
            test.inVariables();
        }
    }
}
