package DanishDynamite;

import java.util.Scanner;

public class Opgave5_8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        input.nextLine();


        System.out.println("Enter the student name and score");
        String nameOfTheStudentAndScore = input.nextLine();
        int scoreForAstudent = Integer.parseInt(nameOfTheStudentAndScore.substring(nameOfTheStudentAndScore.indexOf(' ' + 1, nameOfTheStudentAndScore.length())));

        for (int i = 1; 1 < numberOfStudents; i++){
            System.out.println("Enter the students name and score: ");
            String tempNameAndScore = input.nextLine();
            int tempNamAndScore = Integer.parseInt(tempNameAndScore.substring(tempNameAndScore.indexOf(' ' + 1,tempNameAndScore.length())));

            if (scoreForAstudent < tempNamAndScore)
                nameOfTheStudentAndScore = tempNameAndScore;
            System.out.println("The best student is: " + nameOfTheStudentAndScore.substring(0,nameOfTheStudentAndScore.indexOf(' ')));




        }

    }
}
