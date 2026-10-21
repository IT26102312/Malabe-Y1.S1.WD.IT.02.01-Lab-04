import java.util.Scanner;

public class IT26102312Lab4Q2 {

    public static void main(String[] args) {

        double examMarks, labMarks;
        double examPercentage, labPercentage, finalMark;

        Scanner input = new Scanner(System.in);

        System.out.print("Exam marks (out of 100): ");
        examMarks = input.nextDouble();

        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            input.close();
            return;
        }

        System.out.print("Lab submission marks (out of 100): ");
        labMarks = input.nextDouble();

        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input for lab submission marks. Terminating program.");
            input.close();
            return;
        }

        System.out.print("Percentage given for the exam: ");
        examPercentage = input.nextDouble();

        System.out.print("Percentage given for the lab submission: ");
        labPercentage = input.nextDouble();

        if (examPercentage < 0 || examPercentage > 100 ||
            labPercentage < 0 || labPercentage > 100 ||
            Math.abs(examPercentage + labPercentage - 100) > 0.000001) {

            System.out.println("The percentages must be between 0 and 100 and add up to 100. Terminating program.");
            input.close();
            return;
        }

        finalMark = (examMarks * examPercentage / 100)
                  + (labMarks * labPercentage / 100);

        System.out.println();
        System.out.println("Final Mark is: " + finalMark);

        input.close();
    }
}
