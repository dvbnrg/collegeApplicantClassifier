package com.NN;

/**
 * Created by Dave on 4/6/17.
 */
public class Student {
    @Override
    public String toString() {
        return "Student{" +
                "felon=" + felon +
                ", location='" + location + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", sat=" + sat +
                ", act=" + act +
                ", gpa=" + gpa +
                ", status='" + status + '\'' +
                '}';
    }

    private boolean felon;
    private String location;
    private String firstName;
    private String lastName;
    private int age, sat, act;
    private double gpa;
    private String status;

    public Student (String firstName, String lastName, String location, int age, boolean felon, int sat, int act, double gpa, String status) {
        this.setAge(age);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setLocation(location);
        this.setAge(age);
        this.setFelon(felon);
        this.setSat(sat);
        this.setAct(act);
        this.setGpa(gpa);
        this.setStatus(status);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSat() {
        return sat;
    }

    public void setSat(int sat) {
        this.sat = sat;
    }

    public int getAct() {
        return act;
    }

    public void setAct(int act) {
        this.act = act;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isFelon() {
        return felon;
    }

    public void setFelon(boolean felon) {
        this.felon = felon;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStatus() {
        return status;
    }

    public String getStatus(Student student){return student.getStatus(student);}

    public void setStatus(String status) {
        this.status = status;
    }

    //Helper Methods


    //Where the magic happens

    public void rejectReview(Student student){
        if(isFelon()){student.setStatus("reject b/c felony");}
        else if(getGpa() < 0.7){student.setStatus("reject b/c poor gpa");}
        else if(getAge() <= 0){student.setStatus("reject b/c not born yet");}
        else if(Character.isUpperCase(getFirstName().charAt(0))){student.setStatus("reject b/c firstname not capitalized");}
        else if(Character.isUpperCase(getLastName().charAt(0))){student.setStatus("reject b/c lastname not capitalized");}
    }

    public void acceptReview(Student student){
        if(getAge() >= 17 && getAge() < 26 && getSat() > 1920 && getGpa() > 0.9){student.setStatus("accept");}
        else if (getAge() > 80 && getSat() > 1920 && getGpa() > 0.9){student.setStatus("accept");}
        else if(getSat() > 1920){student.setStatus("accept");}
        else if(getAct() > 27){student.setStatus("accept");}
        else if(getGpa() > 0.9){student.setStatus("accept");}
    }

    public void furtherReview(Student student){
        if (student.getStatus().isEmpty()){student.setStatus("further");}
    }
}
