package Ex08;

/**
 * Created by kurt.Schoenhoff on 20/09/2016.
 */
public abstract class Student {
    String studentID;
    String lastName;
    int annualTuition;

    public Student(String studentID, String name){
        this.studentID = studentID;
        this.lastName = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAnnualTuition() {
        return annualTuition;
    }


    public abstract void setTuition(int fee);
}
