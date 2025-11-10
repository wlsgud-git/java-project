package domain;

public class Subject {
    private String subjectId;      // 과목 ID
    private String name;           // 과목명
//    private String instructor;     // 강사명
//    private int credit;            // 학점(또는 수업시간)
//    private int capacity;          // 최대 정원
//    private int enrolledCount;     // 현재 신청 인원
//    private String schedule;       // 시간표 정보

    public Subject(String subjectId, String name, String instructor, int credit, int capacity, String schedule) {
        this.subjectId = subjectId;
        this.name = name;
    }

    // ===== Getter / Setter =====
    public String getSubjectId() { return subjectId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

} //정은찬