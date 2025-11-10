package domain;

public class Subject {
    private String subjectId;      // 과목 ID
    private String name;           // 과목명
//    private String instructor;     // 강사명
    private int credit;            // 학점(또는 수업시간)
    private int capacity;          // 최대 정원
    private int enrolledCount;     // 현재 신청 인원
    private String schedule;       // 시간표 정보

    public Subject(String subjectId, String name, String instructor, int credit, int capacity, String schedule) {
        this.subjectId = subjectId;
        this.name = name;
//        this.instructor = instructor;
        this.credit = credit;
        this.capacity = capacity;
        this.enrolledCount = 0;
        this.schedule = schedule;

    }

    // ===== Getter / Setter =====
    public String getSubjectId() { return subjectId; }
    public String getName() { return name; }
//    public String getInstructor() { return instructor; }
    public int getCredit() { return credit; }
    public int getCapacity() { return capacity; }
    public int getEnrolledCount() { return enrolledCount; }
    public String getSchedule() { return schedule; }

    public void setName(String name) { this.name = name; }
//    public void setInstructor(String instructor) { this.instructor = instructor; }
    public void setCredit(int credit) { this.credit = credit; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
    public void setSchedule(String schedule) { this.schedule = schedule; }

    // ===== 기능 메서드 =====
    // 수강 인원 1명 추가
//    public boolean addEnrollment() {
//        if (enrolledCount < capacity) {
//            enrolledCount++;
//            return true;
//        }
//        return false; // 정원 초과
//    }
//
//    // 수강 취소 시 인원 감소
//    public void cancelEnrollment() {
//        if (enrolledCount > 0) {
//            enrolledCount--;
//        }
//    }

    // 과목 정보 출력
//    @Override
//    public String toString() {
//        return String.format("[%s] %s | 강사: %s | 인원: %d/%d | 시간: %s",
//                subjectId, name, instructor, enrolledCount, capacity, schedule);
//    }
}