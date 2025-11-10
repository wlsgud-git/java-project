package domain;

public class Student {
    int id;
    String name;

    public void Signup(int id, String name ){
        this.id = id;
        this.name = name;
    };

    public String GetName() {return name;}
    public int getstudentId(){return id;}
} //서진형