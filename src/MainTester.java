import domain.Student;
import domain.Subject;
// import controller.CharacterController;

import domain.EnrollSystem;

public class MainTester {
    public static void main(String[] args) {
        EnrollSystem system = new EnrollSystem();

        Student s1 = new Student("s1", "서진형");
        Student s2 = new Student("s2", "정은찬");

        Subject su1 = new Subject("cs1", "프로그래밍 입문");
        Subject su2 = new Subject("cs2", "네트워크");

        // s1.Signup(0, null);

    }
}
