package BackEnd;

public class Subject {

    private String subjectName;
    private float subjectGrades;
    private int subjectCredits;

    public Subject(){
        this.subjectName = "";
        this.subjectCredits = 0;
    }

    public Subject(String subjectName, Integer subjectCredits){
        this.subjectName = subjectName;
        this.subjectCredits = subjectCredits;
    }

    public void setSubjectName(String subjectName){
        this.subjectName = subjectName;
    }

    public void setSubjectGrade(float subjectGrade){
        this.subjectGrades = subjectGrade;
    }

    public void setSubjectCredits(int subjectCredits){
        this.subjectCredits = subjectCredits;
    }

    public String getSubjectName(){
        return subjectName;
    }

    public float getSubjectGrade(){
        return subjectGrades;
    }

    public int getSubjectCredits(){
        return subjectCredits;
    }
}