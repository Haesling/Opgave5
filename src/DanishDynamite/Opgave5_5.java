package DanishDynamite;

public class Opgave5_5 {

    public static void main(String[] args) {

        System.out.printf("%s %8s %5s %8s %12s \n", "Kilograms", "Pounds", "|", "Pounds", "Kilograms");
        int pounds = 20;

        for (int i = 1; i < 50; i += 2) {


            System.out.printf("%-11d %-10.1f %-3s %-9d %.2f \n", i, (i * 2.2), "|", pounds, (pounds / 1.609));
            pounds = +5;

        }

    }
}


