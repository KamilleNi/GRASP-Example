public class Student {

  //ATTRIBUTES
  private String name;
  private String iD;
  Exam[] exams = new Exam[7];

  //CONSTRUCTOR
  public Student(String name, String iD) {
    setName(name);
    this.iD = iD;
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

<<<<<<< HEAD
=======
  @Override
  public String toString() {
    return name + ", ID: " + iD;
  }
>>>>>>> f62c3d236304f76244d6cd673559a57e55962809
}
