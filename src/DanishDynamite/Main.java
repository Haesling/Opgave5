package DanishDynamite;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int correctCounter, n1, n2, answer;
        long startTime = System.currentTimeMillis();

        correctCounter = 0;

        for (int i = 0; i < 10; i++) {
            n1 = (int) (Math.random() * 15 + 1);
            n2 = (int) (Math.random() * 15 + 1);

            System.out.println(n1 + "+" + n2 + "==");
            answer = input.nextInt();

            if ((n1 + n2) == answer) {
                correctCounter++;

            }
            System.out.println("correct answers: " + correctCounter + "/10"

                    + "\nTime took: " + (System.currentTimeMillis() - startTime) / 1000 + " Seconds ");
        }
    }
}