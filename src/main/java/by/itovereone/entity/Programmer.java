package by.itovereone.entity;

public class Programmer extends Human {
    private String programmingLanguage;
    private String level;

    public Programmer(String name, String programmingLanguage) {
        super(name);
        this.programmingLanguage = programmingLanguage;
    }

    public Programmer(String level) {
        this.level = level;
    }

    public Programmer() {
    }

    public String getProgrammingLanguage() {

        return programmingLanguage;
    }

    public void setProgrammingLanguage() {

        this.programmingLanguage = programmingLanguage;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {

        this.level = level;
    }
}
