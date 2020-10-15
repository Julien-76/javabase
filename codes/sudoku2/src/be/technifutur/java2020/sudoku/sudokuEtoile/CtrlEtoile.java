package be.technifutur.java2020.sudoku.sudokuEtoile;


public class CtrlEtoile {


    VueEtoile ctrVue;
    ModeleEtoile ctrModele;



    public void setModele(ModeleEtoile peche) {
        this.ctrModele = peche;
    }

    public void setVue(VueEtoile poire){
        this.ctrVue = poire;
    }
}
