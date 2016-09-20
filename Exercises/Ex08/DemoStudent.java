package Ex08;

/**
 * Created by kurt.Schoenhoff on 20/09/2016.
 */
public class DemoStudent {

    public static void main(String[] args) {
        Student[] students = new Student[15];

        for (int i = 0; i < 5; i++){
            students[i] = new UndergradStudent("ugradStudent" + i, String.format("%d",123 * i));
            students[i + 5] = new GraduateStudent("gradStudent" + i, String.format("%d",321 * i));
            students[i + 10] = new StudentAtLarge("StudentAt Large" + i, String.format("%d",213 * i));

        }

        for(Student student : students){
            System.out.println("Name: " + student.getLastName() + " StudentID: " + student.getStudentID() + " Tuition fee:" + student.getAnnualTuition());
        }
    }
}
