public class TaskLinkedList {
  private TaskNode head;

  public void addTask(Task task) {
    TaskNode newNode = new TaskNode(task);
    if (head == null) {
      head = newNode;
    } else {
      TaskNode current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = newNode;
    }
    System.out.println("Added: " + task);
  }

  public Task searchTask(String taskId) {
    TaskNode current = head;
    while (current != null) {
      if (current.task.getTaskId().equals(taskId)) {
        return current.task;
      }
      current = current.next;
    }
    return null;
  }

  public void deleteTask(String taskId) {
    if (head == null) return;

    if (head.task.getTaskId().equals(taskId)) {
      head = head.next;
      System.out.println("Deleted task with ID: " + taskId);
      return;
    }

    TaskNode current = head;
    while (current.next != null && !current.next.task.getTaskId().equals(taskId)) {
      current = current.next;
    }

    if (current.next != null) {
      current.next = current.next.next;
      System.out.println("Deleted task with ID: " + taskId);
    } else {
      System.out.println("Task not found: " + taskId);
    }
  }

  public void traverseTasks() {
    TaskNode current = head;
    System.out.println("All Tasks:");
    while (current != null) {
      System.out.println(current.task);
      current = current.next;
    }
  }
}
