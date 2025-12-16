package lexicon;

import java.util.UUID;

import static java.util.UUID.*;

/*
The Student class holds the fields of StudentId, Name, Age and Major.
 */
public class Student {

    private String studentId;
    private String name;
    private int age;
    private String major;

    public Student(String name, int age, String major) {
        this.studentId = generateStudentId();
        this.setName(name);
        this.setAge(age);
        this.setMajor(major);
    }

    public Student(String name, int age) {
        this.studentId = generateStudentId();
        this.setName(name);
        this.setAge(age);
        this.setMajor("null");
    }

    public String getStudentId() {
        return studentId;
    }

    /*
    This method used to generate the random id for the student.
     */
    private String generateStudentId() {
        return UUID.randomUUID().toString().substring(0, 6).toUpperCase();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Age can't be '0' or Negative!");
            return;
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Name can't be empty or null!");
            return;
        }
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    /*
    This method used to print all the information of the student.
     */
    public void getStudentInfo() {
        System.out.println(studentId + " " + name + " " + age + " " + major);
    }
}
