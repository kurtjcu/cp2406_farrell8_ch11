package Ex08;

/**
 * Created by kurt.Schoenhoff on 20/09/2016.
 */
public class StudentAtLarge extends Student {

    StudentAtLarge(String studentID, String name){
        super(studentID, name);
        setTuition(2000);
    }

    @Override
    public void setTuition(int fee) {
        super.annualTuition = fee;
    }
}
