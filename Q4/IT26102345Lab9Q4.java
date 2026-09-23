import java.util.Scanner;

public class IT26102345Lab9Q4 {

    public static double calcFinalMark (double assignmentMark, double examMark) {
	    return (assignmentMark * 0.30) + (examMark * 0.70);
	}
	
	public static String findGrades (double finalMark) {
	    if (finalMark >= 75) {
		    return "A";
		}
		else if (finalMark >= 60) {
		    return "B";
		}
		else if (finalMark >= 50) {
		    return "C";
		}
		else {
		    return "F";
		}
	}
	
    public static void printDetails(String[] names, double[] finalMarks, String[] grades) {

        System.out.println("Name\t\tFinal Mark\tGrade");

        for (int i = 0; i < 5; i++) {
            System.out.println(names[i] + "\t\t" + finalMarks[i] + "\t\t" + grades[i]);
        }
    }

  
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] names = new String[5];
        double[] finalMarks = new double[5];
        String[] grades = new String[5];

       
        for (int i = 0; i < 5; i++) {

            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = input.nextLine();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assignmentMark = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double examMark = input.nextDouble();

            // Calculate final mark
            finalMarks[i] = calcFinalMark(assignmentMark, examMark);

            // Calculate grade
            grades[i] = findGrades(finalMarks[i]);

            input.nextLine(); 
            System.out.println();
        }

        // Display details
        printDetails(names, finalMarks, grades);

    }
}


