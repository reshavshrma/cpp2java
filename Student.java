import java.util.*;

public class Student {

    Scanner scanner = new Scanner(System.in);
    int enteredStudents;
    String name;
    int roll_no;

    public void StudentsData() {

        System.out.print("Enter the number of students: ");
        enteredStudents = scanner.nextInt();
        scanner.nextLine(); 

        for(int i = 0; i <= enteredStudents; i++) {
            System.out.print("Enter the name of the Student " + (i+1) + ": ");
            name = scanner.nextLine();
            System.out.print("Enter the roll number: ");
            roll_no = scanner.nextInt();
            scanner.nextLine();

            int j, sum = 0;
            int marks[] = new int[5];
            for(j = 0; j < 5; j++) {
                System.out.print("Enter the marks for Subject " + (j+1) + ": ");
                marks[j] = scanner.nextInt();
                scanner.nextLine();
                sum = sum + marks[j];
            }
            System.out.println("Total Marks of Student " + (i+1) + ": " + sum);
        }
    }

    public void printData() {
        for(int i = 0; i <=enteredStudents; i++) {
            System.out.println(name[i]);
            System.out.println(roll_no[i]);
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.StudentsData();
        s.printData();
    }
}
