package Assignments.Assignment12;

public class StudentDetails {
    int id,age,year ;
    String name,gender,engDepartment;
    double percentage;
    public StudentDetails(int id, String name, int age, String gender, String engDepartment,int year, double percentage) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.engDepartment = engDepartment;
        this.year = year;
        this.percentage = percentage;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public  String getDepartment() {
        return engDepartment;
    }

    public int getYear() {
        return year;
    }

    public double getPercentage() {
        return percentage;
    }
    }