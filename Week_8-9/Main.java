import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Date (DD/MM/YYYY): ");
        String date = sc.nextLine();
        System.out.println("===== ADD TASKS =====");

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter Task " + i + ": ");
            String task = sc.nextLine();
            tasks.add(task);
        }

        System.out.println("\n===== TASK LIST =====");

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }

        // Save to file
        try (BufferedWriter writer =
                new BufferedWriter(new FileWriter("tasks.txt", true))) {

            writer.write("Date: " + date);
            writer.newLine();

            for (String task : tasks) {
                writer.write(task);
                writer.newLine();

            }

            System.out.println("\nTasks saved successfully.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Read from file
        System.out.println("\n===== TASKS LOADED FROM FILE =====");

        try (BufferedReader reader =
                new BufferedReader(new FileReader("tasks.txt"))) {

            String line;
            System.out.println("Today's Tasks");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}