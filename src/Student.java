public class Student {
  private String name;
  private String iD;
  Exam[] exams = new Exam[7];

  public Student(String name, String iD) {
    setName(name);
    this.iD = iD;
  }

  public void setExams(Exam[] exams) {
    this.exams = exams;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Exam[] getExams() {
    return exams;
  }
}