public class Program {
  public static void main(String[] args) {
    Student student = new Student("Arthur", "S001", "A");

    StudentView view = new StudentView();

    StudentController controller = new StudentController(student, view);

    controller.updateView();

    System.out.println("\nUpdating student data\n");

    controller.setStudentName("Arthur Morgan");
    controller.setStudentGrade("A+");

    controller.updateView();
  }
}
