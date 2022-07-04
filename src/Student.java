
import java.util.ArrayList;

public class Student {
    private String name;
    private String surname;
    private int age;
    private int phNr;
    private String email;
    private ArrayList<Integer> grades;
//------

    public void setEmail(String email) {
        this.email = email;
    }

    //------------
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //------------
    public String getSurname() {
        return this.surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    //------------
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    //------------
    public int getPhNr() {
        return phNr;
    }
    public void setPhNr(int phNr) {
        this.phNr = phNr;
    }
    //------------
    public ArrayList<Integer> getGrades() {
        return grades;
    }
    public void addGrade(int grade) {
        this.grades.add(grade);
    }
    //------------
/*
    public Student() {
        this.grades = new ArrayList<>();
    }*/

 /*   public Student(String name, String surname, int age, int phNr) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phNr = phNr;
        this.grades = new ArrayList<>();
    }*/

    public void introduce() {
        System.out.println("Hi, my name is " + this.name + ", surname - " + this.surname);
    }

    public double gradesAverage() {
        double sum = 0;
        for (int i = 0; i < this.grades.size(); i++) {
            sum += (double) this.grades.get(i);
        }
        return sum / this.grades.size();
    }

    public static void classInfo() {
        System.out.println("this class has 11 methods");
    }

    @Override
    public String toString() {
        return " Vardas.: |" + name + "| Pavarde.: |" + surname + "| Amz.: " + age + "| Tel.: " + phNr + "| Email: " + email;
    }
}