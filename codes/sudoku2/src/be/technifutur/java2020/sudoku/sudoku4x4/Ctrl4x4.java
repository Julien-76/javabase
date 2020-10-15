package be.technifutur.java2020.sudoku.sudoku4x4;
import java.util.Scanner;



public class Ctrl4x4 {


    int l, c;
    char v;
    String cmd;
    Vue4x4 ctVue;
    Modele4x4 ctModele;

    public void setModele(Modele4x4 peche) {
        this.ctModele = peche;
    }

    public void setVue(Vue4x4 poire){
        this.ctVue = poire;
    }

    public void valeurs(){
        String scan;
        System.out.println("Entre la ligne, la colonne et la valeur, séparés de points. Pour terminer, entre Q comme valeur");
        Scanner sc = new Scanner(System.in);
        scan = sc.nextLine();
        while (scan.length() > 5 || scan.charAt(1) != '.' || scan.charAt(3) != '.' || Character.getNumericValue(scan.charAt(0)) > 4 || Character.getNumericValue(scan.charAt(2)) > 4){
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
        Ctrl4x4 test = new Ctrl4x4();
        Vue4x4 ctrlVue = new Vue4x4();
        Modele4x4 ctrlMod = new Modele4x4();
        System.out.println("Voici la grille vide :\n");
        ctrlVue.afficheGrilleVide();
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
