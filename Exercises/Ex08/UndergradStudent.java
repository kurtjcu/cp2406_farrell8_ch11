package Ex08;

/**
 * Created by kurt.Schoenhoff on 20/09/2016.
 */
public class UndergradStudent extends Student {

    UndergradStudent(String studentID, String name){
        super(studentID, name);
        setTuition(4000);
    }

    @Override
    public void setTuition(int fee) {
        super.annualTuition = fee;
    }
}
