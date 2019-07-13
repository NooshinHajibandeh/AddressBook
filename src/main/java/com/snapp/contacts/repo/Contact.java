package com.snapp.contacts.repo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "Contact")
public class Contact implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "fullName")
    @NotNull
    private String fullName;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    public Contact(String name, String phone, String email, String organization) {
        this.fullName = name;
        this.phoneNumber = phone;
        this.email = email;
        this.organization = organization;
    }

    public Contact() {
    }

    @Column(name = "email")
    private String email;

    @Column(name = "organization")
    private String organization;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Override
    public String toString() {
        return "Contact [id=" + id + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", email=" + email + ", organization="
                + organization + "]";
    }

}
