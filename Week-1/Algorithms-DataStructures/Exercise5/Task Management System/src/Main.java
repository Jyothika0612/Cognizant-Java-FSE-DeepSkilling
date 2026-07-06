public class Main {

    public static void main(String[] args) {

        TaskLinkedList list = new TaskLinkedList();

        Task t1 = new Task(101, "Complete Java Assignment", "Pending");
        Task t2 = new Task(102, "Prepare for Interview", "In Progress");
        Task t3 = new Task(103, "Practice DSA", "Pending");

        // Add Tasks
        list.addTask(t1);
        list.addTask(t2);
        list.addTask(t3);

        // Display Tasks
        System.out.println("\n===== Task List =====");
        list.displayTasks();

        // Search Task
        System.out.println("\n===== Search Task =====");
        list.searchTask(102);

        // Delete Task
        System.out.println("\n===== Delete Task =====");
        list.deleteTask(102);

        // Display After Deletion
        System.out.println("\n===== Task List After Deletion =====");
        list.displayTasks();

    }

}