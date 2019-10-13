package BackEnd;

public class Student {

    private String studentName;
    private String studentSurname;


    public Student(){
        this.studentName = "";
        this.studentSurname = "";
    }

    public Student(String studentName, String studentSurname){
        this.studentName = studentName;
        this.studentSurname = studentSurname;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }
/*
    public float getGPA() {
        float x = 0;
        float y = 0;

        for (int i = 1; i <= numberOfSubjects; i++) {
            x = x + subjectList[i].getSubjectCredits() * subjectList[i].getSubjectGrade();
            y = y + subjectList[i].getSubjectCredits();
        }
        return x / y;
    }*/

}