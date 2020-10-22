package JavaLangage.primitif;

public class Possibilities {
    int data = 0b10010;

    public boolean Countains(int nbre){
        boolean place = true;
        if ((this.data & (1 << (nbre-1))) != 0) {
            place = false;
        }
        return place;
    }

    public boolean Add(int nbre){
        boolean place;
        


        return place;
    }
}
