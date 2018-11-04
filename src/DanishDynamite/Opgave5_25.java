package DanishDynamite;

public class Opgave5_25 {

    public static void main(String[] args) {

        double pih = 0;

        for( int i = 1; i <= 100000; i++){

            pih += 4 * (Math.pow(-1,(i +1))/ ((2 * i -1)));

            System.out.println(pih);
        }
    }
}
