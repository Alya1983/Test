package by.itovereone.entity;

import java.util.List;
import java.util.Map;

public class Student extends Human   {
    private String group;
    private Map<String, List<Integer>> marks;
    private String nameCafedra;
    private int course;
    private int age;
    private int avg;

    public Student(String name, String gender, int id, int age, String nameCafedra, String group, int course,  Map<String, List<Integer>> marks) {
        super(name, gender, id, age);
        this.nameCafedra = nameCafedra;
        this.group = group;
        this.course = course;
        this.marks = marks;
    }


    @Override
    public String toString() {

        return "Student{name=" + getName() +
                ", gender=" + getGender() +
                ", id=" + getId() +
                ", age=" + getAge() +
                ", group='" + group + '\'' +
                ", marks=" + marks +
                ", nameCafedra='" + nameCafedra + '\'' +
                ", course=" + course +
                ", avg="+ avg +
                '}';
    }
    public String getGroup() {

        return group;
    }

    public void setGroup(String group) {

        this.group = group;

    }

    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    public Map<String, List<Integer>> getMarks() {

        return marks;
    }

    public String getNameCafedra() {

        return nameCafedra;
    }

    public int getCourse() {

        return course;
    }

    public void setCourse(int course) {

        this.course = course;
    }

    public void setNameCafedra(String nameCafedra) {

        this.nameCafedra = nameCafedra;
    }

    public void setMarks(Map<String, List<Integer>> marks) {
        this.marks = marks;
    }


}



