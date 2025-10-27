import java.util.Scanner;

/**
 * CGPA Calculator
 * ----------------
 * This simple program calculates the CGPA (Cumulative Grade Point Average)
 * based on user input for the number of subjects, their credits, and grades.
 *
 * Author: Apurva Shivam
 * Version: 1.0
 */

public class CGPACalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== CGPA CALCULATOR =====\n");

        // Step 1: Input number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        // Step 2: Create arrays to store grades and credits
        double[] grades = new double[numSubjects];
        int[] credits = new int[numSubjects];

        // Step 3: Input details for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.println("\n--- Subject " + (i + 1) + " ---");
            System.out.print("Enter grade point (out of 10): ");
            grades[i] = sc.nextDouble();

            System.out.print("Enter credit for this subject: ");
            credits[i] = sc.nextInt();
        }

        // Step 4: Calculate weighted grade points and total credits
        double totalWeightedGrade = 0;
        int totalCredits = 0;

        for (int i = 0; i < numSubjects; i++) {
            totalWeightedGrade += grades[i] * credits[i];
            totalCredits += credits[i];
        }

        // Step 5: Compute CGPA
        double cgpa = totalWeightedGrade / totalCredits;

        // Step 6: Display result
        System.out.println("\n==============================");
        System.out.printf("Your CGPA is: %.2f\n", cgpa);

        // Optional: Estimate percentage
        double percentage = cgpa * 9.5;
        System.out.printf("Approx. Percentage: %.2f%%\n", percentage);
        System.out.println("==============================");

        sc.close();
    }
}
