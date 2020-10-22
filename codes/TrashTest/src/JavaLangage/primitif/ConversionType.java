package JavaLangage.primitif;

public class ConversionType {

    public static void main(String[] args) {

        long l = Long.MAX_VALUE;
        for(int cpt = 0; cpt <50; cpt++){
            double f = l;
            long l2 = (long) f;
            System.out.println(f + " - " + l);
            l -= 500;

        }
    }
}
