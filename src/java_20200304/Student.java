package java_20200304;

public class Student {
    private String name;
    private String home;
    private int age;
    private String school;


    public Student(String name, String home, int age, String school) {
        this.name = name;
        this.home = home;
        this.age = age;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String toString(){
        return this.home+this.name+this.school+this.age;
    }
}

