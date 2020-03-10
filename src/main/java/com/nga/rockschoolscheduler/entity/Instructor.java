package com.nga.rockschoolscheduler.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Instructor {

    @Id
    @GeneratedValue
    private int id;

    private String firstName;

    private String lastName;

    private LocalDate birthDate;

    private String gender;

    private String telNumber;

    private String vkAccount;

    private String instAccount;

    private int subjectId;

    public Instructor() {
    }

    public Instructor(String firstName, String lastName, LocalDate birthDate, String gender, String telNumber, String vkAccount, String instAccount, int subjectId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.telNumber = telNumber;
        this.vkAccount = vkAccount;
        this.instAccount = instAccount;
        this.subjectId = subjectId;
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", gender='" + gender + '\'' +
                ", telNumber='" + telNumber + '\'' +
                ", vkAccount='" + vkAccount + '\'' +
                ", instAccount='" + instAccount + '\'' +
                ", subjectId=" + subjectId +
                '}';
    }
}
