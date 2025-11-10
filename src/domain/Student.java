package domain;

public class Student {
    private String id;
    private String name;

    public void Student(String id, String name ){
        this.id = id;
        this.name = name;
    };

    public String GetName() {return name;}
    public String getstudentId(){return id;}
} //서진형