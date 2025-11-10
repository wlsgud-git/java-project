package domain;

public class Enroll {
    private Student student;
    private Subject subject;

    public void Enrollment(Student student, Subject subject){
        this.student = student;
        this.subject = subject;
    }
} //전종수