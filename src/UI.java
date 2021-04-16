import java.util.Scanner;

public class UI {
  Scanner sc = new Scanner(System.in);

  void printMenu(){
    System.out.println("1. Enter Student");
    System.out.println("2. Show Student List");
    System.out.println("3. Show Grads");
    System.out.println("4. Remove Student");
    System.out.println("9. Exit");
  }

  void getMenuOption(){}

  public String getStudent(String message){
    System.out.println(message);
    return sc.nextLine();
  }

  void showStudentList(){}

  void showGrads(){}
}
