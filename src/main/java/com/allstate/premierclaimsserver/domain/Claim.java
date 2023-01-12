package com.allstate.premierclaimsserver.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;
@Entity
public class Claim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Double claimamount;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String status;
    private Date claimDate;
    private String claim_id;
    private String claimType;
    private String claimdetails;

    public Double getClaimamount() {
        return claimamount;
    }

    public void setClaimamount(Double claimamount) {
        this.claimamount = claimamount;
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

    public String getClaim_id() {
        return claim_id;
    }

    public void setClaim_id(String claim_id) {
        this.claim_id = claim_id;
    }

    public String getClaimType() {
        return claimType;
    }

    public void setClaimType(String claimType) {
        this.claimType = claimType;
    }

    public String getClaimdetails() {
        return claimdetails;
    }

    public void setClaimdetails(String claimdetails) {
        this.claimdetails = claimdetails;
    }

    public Claim(Double claimamount, String firstName, String lastName, String email, String phone, String status, Date claimDate, String claim_id, String claimType, String claimdetails) {
        this.claimamount = claimamount;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.status = status;
        this.claimDate = claimDate;
        this.claim_id = claim_id;
        this.claimType = claimType;
        this.claimdetails = claimdetails;
    }

    public Claim() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Claim claim = (Claim) o;
        return Objects.equals(claimamount, claim.claimamount) && Objects.equals(firstName, claim.firstName) && Objects.equals(lastName, claim.lastName) && Objects.equals(email, claim.email) && Objects.equals(phone, claim.phone) && Objects.equals(status, claim.status) && Objects.equals(claimDate, claim.claimDate) && Objects.equals(claim_id, claim.claim_id) && Objects.equals(claimType, claim.claimType) && Objects.equals(claimdetails, claim.claimdetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(claimamount, firstName, lastName, email, phone, status, claimDate, claim_id, claimType, claimdetails);
    }

    @Override
    public String toString() {
        return "Claim{" +
                "claimamount=" + claimamount +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", status='" + status + '\'' +
                ", claimDate=" + claimDate +
                ", claim_id='" + claim_id + '\'' +
                ", claimType='" + claimType + '\'' +
                ", claimdetails='" + claimdetails + '\'' +
                '}';
    }
}
