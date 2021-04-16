public class Exam {

  //ATTRIBUTES
  private String name;
  private int grade;

  //CONSTRUCTOR
  public Exam(String name, int grade){
    this.name = name;
    setGrade(grade);
  }

  //GETTER
  public int getGrade(){
    return grade;
  }

  //SETTER
  public void setGrade(int grade){
    this.grade = grade;
  }

  @Override
  public String toString() {
    return name + ": " + grade;
  }
}
