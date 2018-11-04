package DanishDynamite;

public class Opgave5_3 {

    public static void main(String[] args) {
        System.out.printf("%s%10s", "kilograms", "Pounds");

        for(int i = 1; i < 99; i += 2){
            System.out.printf("%-14d%.1f\n", i,(i * 2.2));



        }
    }
}
