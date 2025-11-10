package domain;
import java.util.ArrayList;
import java.util.List;

public class EnrollSystem {
    private List<Student> student = new ArrayList<>();
    private List<Subject> subject = new ArrayList<>();
    private List<Enroll> enrollList = new ArrayList<>();

    public void printAllEnrollments(Student student, Subject subject){
        // enrollList.add(new Enroll(student, subject));
        System.out.println(student.GetName() + "학생이" + subject.getName() + "과목을 신청했습니다.");
    }
}
