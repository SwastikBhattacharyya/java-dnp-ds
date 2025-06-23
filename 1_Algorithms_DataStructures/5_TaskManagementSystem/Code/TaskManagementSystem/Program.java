public class Program {
  public static void main(String[] args) {
    TaskLinkedList taskList = new TaskLinkedList();

    taskList.addTask(new Task("T001", "Design UI", "Pending"));
    taskList.addTask(new Task("T002", "Implement API", "In Progress"));
    taskList.addTask(new Task("T003", "Write Tests", "Pending"));

    taskList.traverseTasks();

    System.out.println("\nSearching for T002:");
    Task found = taskList.searchTask("T002");
    System.out.println(found != null ? found : "Not found");

    System.out.println("\nDeleting T002...");
    taskList.deleteTask("T002");

    taskList.traverseTasks();
  }
}
