public class Student {

  //ATTRIBUTES
  private String name;
  private String iD;
  Exam[] exams = new Exam[7];

  //CONSTRUCTOR
  public Student(String name, String iD, Exam[] exams) {
    setName(name);
    this.iD = iD;
    setExams(exams);
  }

  //GETTER
  public Exam[] getExams() {
    return exams;
  }

  //SETTER
  public void setExams(Exam[] exams) {
    this.exams = exams;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name + ", ID: " + iD;
  }
}
