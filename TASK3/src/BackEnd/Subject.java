package BackEnd;

public class Subject {

    private String subjectName;
    private float subjectGrades;
    private int subjectCredits;

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