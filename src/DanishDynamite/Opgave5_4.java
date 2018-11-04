package DanishDynamite;

public class Opgave5_4 {

    public static void main(String[] args) {

        System.out.printf("%s%13s\n", "miles", "kilometers");

        for (int i = 1; i <= 10; i++) {

                System.out.printf("%-10d%.1f\n", i, (i * 1.609));

            }
        }
    }
