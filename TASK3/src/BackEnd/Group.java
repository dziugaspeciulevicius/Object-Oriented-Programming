package BackEnd;

public class Group {

    private String groupName;
    private int semester;
    private Student[] studentList;
    private Subject[] subjectList;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Student[] getStudents() {
        return studentList;
    }

    public void setStudents(Student[] students) {
        this.studentList = students;
    }

    public Subject[] getSubjects() {
        return subjectList;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjectList = subjects;
    }
}
