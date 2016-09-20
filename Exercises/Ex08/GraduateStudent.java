package Ex08;

/**
 * Created by kurt.Schoenhoff on 20/09/2016.
 */
public class GraduateStudent extends Student {

    GraduateStudent(String studentID, String name){
        super(studentID, name);
        setTuition(6000);
    }

    @Override
    public void setTuition(int fee) {
        super.annualTuition = fee;
    }
}
