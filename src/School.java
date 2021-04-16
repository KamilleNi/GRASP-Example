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
          registerStudent();
          break;
        case 2:
          ui.showStudentList(students);
          break;
        case 3:
          ui.showGrades(students);
          break;
        case 4:
          removeStudent();
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

  public void registerStudent() {
    String name = ui.getStudent("Enter name: ");
    String iD = ui.getStudent("Enter ID: ");

    Exam[] exams = new Exam[7];

    for (int i = 0; i < exams.length; i++) {
      String examType = ui.getStudent("Enter exam: ");
      ui.getStudent("Enter grade");
      int grade = ui.studentNumber();
      exams[i] = new Exam(examType, grade);
    }

    Student student = new Student(name, iD, exams);
    students.add(student);
  }

  public void removeStudent() {
    ui.showStudentList(students);
    ui.returnMessage("Which student is to be removed?\n Please enter their number");

    students.remove(ui.studentNumber()- 1);
  }
}
