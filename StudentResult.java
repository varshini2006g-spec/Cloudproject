import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== CKCET STUDENT RESULT SYSTEM =====");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Java Mark: ");
        int java = sc.nextInt();

        System.out.print("Enter Python Mark: ");
        int python = sc.nextInt();

        System.out.print("Enter Cloud Computing Mark: ");
        int cloud = sc.nextInt();

        int total = java + python + cloud;
        double average = total / 3.0;

        String result;

        if (java >= 40 && python >= 40 && cloud >= 40) {
            result = "PASS";
        } else {
            result = "FAIL";
        }

        System.out.println("\n===== STUDENT RESULT =====");
        System.out.println("Name       : " + name);
        System.out.println("Department : " + department);
        System.out.println("Java       : " + java);
        System.out.println("Python     : " + python);
        System.out.println("Cloud      : " + cloud);
        System.out.println("Total      : " + total);
        System.out.println("Average    : " + average);
        System.out.println("Result     : " + result);

        sc.close();
    }
}