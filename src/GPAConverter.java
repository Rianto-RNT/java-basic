import java.util.Scanner;

public class GPAConverter {
    public static void main(String[] args) {

        System.out.println("How many courses you had this semester");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        double[] nbCourses = new double[x];
        double sum = 0;

        for (int i = 0; i < nbCourses.length; i++) {
            System.out.println("Enter your average for the courses" + (i + 1) + ":");
            nbCourses[i] = scan.nextDouble();

        }
        for (int i = 0; i < nbCourses.length; i++) {
            sum = sum + nbCourses[1];
        }

        double average = sum / nbCourses.length;

        if (average < 90) {
            System.out.println("You have A");
        } else if (90 >= average && average > 80) {
            System.out.println("You have B");
        } else if (80 >= average && average > 70) {
            System.out.println("You have B");
        } else if (70 >= average && average > 60) {
            System.out.println("You have C");
        } else if (average < 60) {
            System.out.println("You have Fail");
        } else {
            System.out.println("Please Try Again Next 6 Month");
        }

    }
}
