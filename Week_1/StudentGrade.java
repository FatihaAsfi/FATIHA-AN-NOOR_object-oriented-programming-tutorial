import java.util.Scanner;


public class StudentGrade {
    public static void main(String[] args) {
        String name , course, id ;
        double mark1;
        char grade;
        
    

        Scanner input = new Scanner (System.in);

      
        System.out.print("Enter Name: ");
        name = input.nextLine();
        System.out.print("Enter ID: ");
        id = input.nextLine();
        System.out.print("Enter Course Name: ");
        course = input.nextLine();

     
        System.out.println ("Enter Coding marks: ");
        mark1 = input.nextDouble();
        if (mark1 >= 80) {
            grade = 'A';
        } else if (mark1 >= 70) {
            grade = 'B';
        } else if (mark1 >= 60) {
            grade = 'C';
        } else if (mark1 >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Hello, " + name + "," + "Your ID is: " + id);
        System.out.println("Your Coding Mark is: " + mark1);
        System.out.println(" So, Your Grade is : " + grade);

        input.close();
    }
}