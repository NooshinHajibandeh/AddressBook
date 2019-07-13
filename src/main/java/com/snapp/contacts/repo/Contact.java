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

    @Column(name = "phone")
    private String phone;

    public Contact(String name, String phone, String email, String organization) {
        this.fullName = name;
        this.phone = phone;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
        return "Contact [id=" + id + ", fullName=" + fullName + ", phone=" + phone + ", email=" + email + ", organization="
                + organization + "]";
    }

}
