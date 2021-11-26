package by.itovereone.entity;

import org.springframework.context.annotation.Configuration;

import javax.naming.Name;

public class Teacher {
    private int id;
    private String name;
    private int age;
    private String subjname;

    public Teacher() {
    }

    public Teacher(int id, String name, int age, String subjname) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.subjname = subjname;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", subjname='" + subjname + '\'' +
                '}';
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSubjname() {
        return subjname;
    }

    public void setSubjname(String subjname) {
        this.subjname = subjname;
    }
}


