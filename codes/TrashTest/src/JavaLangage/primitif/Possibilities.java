package JavaLangage.primitif;

public class Possibilities {
    int data;

    public boolean Countains(int nbreCountains){
        boolean place = true;
        if ((this.data & (1 << (nbreCountains - 1))) != 0) {
            place = false;
        }
        return place;
    }

    public boolean Add(int nbreAdd){
        boolean place = false;
        if (this.Countains(nbreAdd)) {
            this.data = this.data ^ (1 << (nbreAdd - 1));
            place = true;
        }
        return place;
    }

    public boolean Remove(int nbreRemove){
        boolean suppression = false;
        if (!(this.Countains(nbreRemove))) {
            this.data = this.data ^ (1 << (nbreRemove - 1));
            suppression = true;
        }
        return suppression;
    }

    public int Size(){
        int placesDispo = 9 - Integer.bitCount(this.data);


        return placesDispo;
    }

    public static void main(String[] args) {
        Possibilities testPoss = new Possibilities();
        testPoss.data = 0b101110010;
        System.out.println("Chanie de base : \n" + Integer.toBinaryString(testPoss.data));

        System.out.println("\nAjouter position demandée : \n" + testPoss.Add(4));
        System.out.println("Chaine après add : \n" + Integer.toBinaryString(testPoss.data));

        System.out.println("\nRetirer position demandée : \n" + testPoss.Remove(8));
        System.out.println("Chaine après remove : \n" + Integer.toBinaryString(testPoss.data));

        System.out.println("\nPlaces restantes : \n" + testPoss.Size());
    }


}
