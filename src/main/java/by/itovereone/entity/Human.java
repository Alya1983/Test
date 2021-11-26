package by.itovereone.entity;

public class Human implements Comparable<Human> {//добавляем возмможность сравнивать объекты
   
    private String name;
    private int id;
    private int age;
    private String gender;

    public Human(String name) { //конструктор

        this.name = name;
    }

    public Human(String name, String gender, int id, int age) { //конструктор с параметрами
        this.name = name;
        this.gender = gender;
        this.id = id;
        this.age = age;
    }

    public Human() {

    }

    public Human(int id, int age) {
        this.id = id;
        this.age = age;
        System.out.println(id);
        System.out.println(age);
    }

    @Override//
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Human o) {
        int result=this.name.compareTo(o.name);
        return result;
    }

    public String getName() {//получаем и выводим в консоль первоначальное значение

        return name;
    }


    public void setName(String name) {//назначаем его полю новое значение, после чего с
        // помощью гет получаем и выводим новое значение
        this.name = name;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getGender() {

        return gender;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }
}
