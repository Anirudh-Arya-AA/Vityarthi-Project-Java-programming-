import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks of Subject 1: ");
        int s1 = sc.nextInt();

        System.out.print("Enter Marks of Subject 2: ");
        int s2 = sc.nextInt();

        System.out.print("Enter Marks of Subject 3: ");
        int s3 = sc.nextInt();

        int total = s1 + s2 + s3;
        double average = total / 3.0;

        String grade;

        if (average >= 90) {
            grade = "A";
        } else if (average >= 75) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\n----- RESULT -----");
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}