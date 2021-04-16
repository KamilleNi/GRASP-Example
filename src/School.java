import java.util.ArrayList;

public class School {
  UI ui = new UI();
  ArrayList<Student> students = new ArrayList<>();

  public void runMenu() {
    int choice;
    boolean keepRunning = true;

    do {
      ui.printMenu();
      choice = ui.getMenuOption();
      switch (choice) {
        case 1:
          ui.showStudentList(students);
          break;
        case 2:
          registerStudent();
          break;
        case 3:
          removeStudent();
          break;
        case 4:
          ui.showGrades(students);
          break;
        case 9:
          ui.returnMessage("Quit!");
          keepRunning = false;
          break;
        default:
          ui.returnMessage("This is not a valid choice.");
      }
    } while (keepRunning);
  }

  void registerStudent() {
    String name = ui.getStudent("Enter name: ");
    String iD = ui.getStudent("Enter ID: ");
    Student student = new Student(name, iD);
    students.add(student);
  }

  void removeStudent() {
  }
}
