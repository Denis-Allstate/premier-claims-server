package com.allstate.premierclaimsserver.domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;
@Entity
public class Claim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Double claimAmount;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String status;
    private Date claimDate;
    private String claimId;
    private String claimType;
    private String claimDetails;
//    @OneToMany
//    private List<String> notes;
//    @OneToMany
//    private List<String> tasks;

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Claim{" +
                ", claimAmount=" + claimAmount +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", status='" + status + '\'' +
                ", claimDate=" + claimDate +
                ", claimId='" + claimId + '\'' +
                ", claimType='" + claimType + '\'' +
                ", claimDetails='" + claimDetails + '\'' +

                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Claim claim = (Claim) o;
        return Objects.equals(id, claim.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    public List getNotes() {
//        return notes;
//    }
//
//    public void setNotes(List notes) {
//        this.notes = notes;
//    }
//
//    public List getTasks() {
//        return tasks;
//    }
//
//    public void setTasks(List tasks) {
//        this.tasks = tasks;
//    }

    public Double getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(Double claimAmount) {
        this.claimAmount = claimAmount;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(Date claimDate) {
        this.claimDate = claimDate;
    }

    public String getClaimId() {
        return claimId;
    }

    public void setClaimId(String claimId) {
        this.claimId = claimId;
    }

    public String getClaimType() {
        return claimType;
    }

    public void setClaimType(String claimType) {
        this.claimType = claimType;
    }

    public String getClaimDetails() {
        return claimDetails;
    }

    public void setClaimDetails(String claimDetails) {
        this.claimDetails = claimDetails;
    }

    public Claim(Double claimAmount, String firstName, String lastName, String email, String phone, String status, Date claimDate, String claimId, String claimType, String claimDetails) {
        this.claimAmount = claimAmount;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.status = status;
        this.claimDate = claimDate;
        this.claimId = claimId;
        this.claimType = claimType;
        this.claimDetails = claimDetails;

    }
    public Claim() {
    }

}
