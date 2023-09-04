package com.webapp.microserviceswebapp.model;

import javax.persistence.*;
import java.util.Date;

//JsonFilter("monFiltreDynamique")
@Entity
public class Customer {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private String firstname;
    private Date birthday;
    private String driverLicenseNumber;

    public Customer() {

    }

    public Customer(int id, String name, String firstname, Date birthday, String driverLicenseNumber) {
        this.id = id;
        this.name = name;
        this.firstname = firstname;
        this.birthday = birthday;
        this.driverLicenseNumber = driverLicenseNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }

    public void setDriverLicenseNumber(String driverLicenseNumber) {
        this.driverLicenseNumber = driverLicenseNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", firstname='" + firstname + '\'' +
                ", birthday=" + birthday +
                ", driverLicenseNumber='" + driverLicenseNumber + '\'' +
                '}';
    }
}
