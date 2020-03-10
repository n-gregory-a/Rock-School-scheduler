package com.nga.rockschoolscheduler.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private int id;

    private String firstName;

    private String lastName;

    private String gender;

    private LocalDate birthDate;

    private String telNumber;

    private String vkAccount;

    private String instAccount;

    private int subjectId;

    private int instructorId;

    public Student() {
    }

    public Student(String lastName, String gender, LocalDate birthDate, String telNumber, String vkAccount, String instAccount, int subjectId, int instructorId) {
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.telNumber = telNumber;
        this.vkAccount = vkAccount;
        this.instAccount = instAccount;
        this.subjectId = subjectId;
        this.instructorId = instructorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getVkAccount() {
        return vkAccount;
    }

    public void setVkAccount(String vkAccount) {
        this.vkAccount = vkAccount;
    }

    public String getInstAccount() {
        return instAccount;
    }

    public void setInstAccount(String instAccount) {
        this.instAccount = instAccount;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate=" + birthDate +
                ", telNumber='" + telNumber + '\'' +
                ", vkAccount='" + vkAccount + '\'' +
                ", instAccount='" + instAccount + '\'' +
                ", subjectId=" + subjectId +
                ", instructorId=" + instructorId +
                '}';
    }
}
