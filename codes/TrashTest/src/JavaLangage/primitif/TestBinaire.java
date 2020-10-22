package JavaLangage.primitif;

public class TestBinaire {
    public static void main(String[] args) {
        int a = -45;
        System.out.println(Integer.toBinaryString(a));

        int b= 5, c = 12;
        System.out.println(b & c);


        int possibilite = 0b100111010;

        System.out.println(Integer.toBinaryString(possibilite));

        System.out.println(Integer.toBinaryString(possibilite ^ (1 << 3)));
    }
}
