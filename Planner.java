import java.util.ArrayList;
import java.util.Scanner;

public class Planner {
    private ArrayList<Task> tasks;
    private Scanner scanner;

    public Planner() {
        tasks = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void run() {
        int choice;
        do {
            System.out.println("\n=== School Planner ===");
            System.out.println("1. Add Task");
            System.out.println("2. View All Tasks");
            System.out.println("3. Search Tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addTask();
                case 2 -> viewTasks();
                case 3 -> searchTasks();
                case 4 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 4);
    }

    private void addTask() {
        System.out.print("Enter subject: ");
        String subject = scanner.nextLine();
        System.out.print("Enter description: ");
        String description = scanner.nextLine();
        System.out.print("Enter type (Homework, Test, etc.): ");
        String type = scanner.nextLine();

        SchoolTask task = new SchoolTask(subject, description, type);
        tasks.add(task);
        System.out.println("Task added!");
    }

    private void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks added yet.");
        } else {
            System.out.println("\n--- All Tasks ---");
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    private void searchTasks() {
        System.out.print("Enter keyword to search: ");
        String keyword = scanner.nextLine().toLowerCase();
        boolean found = false;

        for (Task task : tasks) {
            if (task.getSubject().toLowerCase().contains(keyword) ||
                task.getDescription().toLowerCase().contains(keyword)) {
                System.out.println(task);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching tasks found.");
        }
    }
}