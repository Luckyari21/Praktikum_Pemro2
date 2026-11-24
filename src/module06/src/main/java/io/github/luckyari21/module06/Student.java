package io.github.luckyari21.module06;

public class Student {
    private int id;
    private String name;
    private String studentId;

    public Student(int id, String name, String studentId) {
        this.id = id;
        this.name = name;
        this.studentId = studentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}