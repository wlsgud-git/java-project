package domain;

public class Subject {
    private String subjectId;      // 과목 ID
    private String name;           // 과목명

    public Subject(String subjectId, String name ) {
        this.subjectId = subjectId;
        this.name = name;
    }

    // ===== Getter / Setter =====
    public String getSubjectId() { return subjectId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

} //정은찬