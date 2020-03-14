package com.nga.rockschoolscheduler.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "tel_number")
    private String telNumber;

    @Column(name = "vk_account")
    private String vkAccount;

    @Column(name = "inst_account")
    private String instAccount;

    @Column(name = "subject_id")
    private int subjectId;

    @Column(name = "instructor_id")
    private int instructorId;

    public Student() {
    }

    public Student(String firstName, String lastName, String gender, LocalDate birthDate, String telNumber, String vkAccount, String instAccount, int subjectId, int instructorId) {
        this.firstName = firstName;
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
