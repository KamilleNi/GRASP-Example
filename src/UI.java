import java.util.ArrayList;
import java.util.Scanner;

public class UI {
  Scanner sc = new Scanner(System.in);

  void printMenu(){
    System.out.println("MENU:");
    System.out.println("1. Enter Student");
    System.out.println("2. Show Student List");
    System.out.println("3. Show Grades");
    System.out.println("4. Remove Student");
    System.out.println("9. Exit");
    System.out.println("Please choose an option:");
  }

  public int getMenuOption(){
    int choice = 0;
    while(!sc.hasNextInt()){
      System.out.println("Please enter a number!");
      System.out.println("Enter choice: ");
      sc.nextLine();
    }
    choice = sc.nextInt();
    sc.nextLine();
    return choice;
  }

  public String getStudent(String message){
    System.out.println(message);
    return sc.nextLine();
  }

  public void showStudentList(ArrayList<Student> students){
    for(int i = 0; i < students.size(); i++){
      System.out.println("Student nr.: " + (i + 1) + ". " + students.get(i).toString());
    }
    System.out.println();
  }

  public void showGrades(ArrayList<Student> students){
    for(int i = 0; i < students.size(); i++){
      System.out.println(students.get(i).getExams());
    }
  }

  public void returnMessage(String message){
    System.out.println(message);
  }

  public int studentNumber(){
    int number = 0;
    number = sc.nextInt();
    sc.nextLine();

    return number;
  }

}
