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

    private String address;
    private String year;
    private String make;
    private String model;
    private String typeAnimal;
    private String breed;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }

    public void setTypeAnimal(String typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
//    @OneToMany
//    private List<String> notes;
//    @OneToMany
//    private List<String> tasks;

    public Claim(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Claim{" +
                "id=" + id +
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
                ", address='" + address + '\'' +
                ", year='" + year + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", typeAnimal='" + typeAnimal + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Claim claim = (Claim) o;
        return Objects.equals(id, claim.id) && Objects.equals(claimAmount, claim.claimAmount) && Objects.equals(firstName, claim.firstName) && Objects.equals(lastName, claim.lastName) && Objects.equals(email, claim.email) && Objects.equals(phone, claim.phone) && Objects.equals(status, claim.status) && Objects.equals(claimDate, claim.claimDate) && Objects.equals(claimId, claim.claimId) && Objects.equals(claimType, claim.claimType) && Objects.equals(claimDetails, claim.claimDetails) && Objects.equals(address, claim.address) && Objects.equals(year, claim.year) && Objects.equals(make, claim.make) && Objects.equals(model, claim.model) && Objects.equals(typeAnimal, claim.typeAnimal) && Objects.equals(breed, claim.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, claimAmount, firstName, lastName, email, phone, status, claimDate, claimId, claimType, claimDetails, address, year, make, model, typeAnimal, breed);
    }

    public Integer getId() {
        return id;
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

    public Claim(Integer id, Double claimAmount, String firstName, String lastName, String email, String phone, String status, Date claimDate, String claimId, String claimType, String claimDetails, String address, String year, String make, String model, String typeAnimal, String breed) {
        this.id = id;
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
        this.address = address;
        this.year = year;
        this.make = make;
        this.model = model;
        this.typeAnimal = typeAnimal;
        this.breed = breed;
    }

    //    public Claim(Double claimAmount, String firstName, String lastName, String email, String phone, String status, Date claimDate, String claimId, String claimType, String claimDetails) {
//        this.claimAmount = claimAmount;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.phone = phone;
//        this.status = status;
//        this.claimDate = claimDate;
//        this.claimId = claimId;
//        this.claimType = claimType;
//        this.claimDetails = claimDetails;
//
//    }
    public Claim() {
    }

}
