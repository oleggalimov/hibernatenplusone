package org.oleggalimov.hibernate.nplusone.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table (name = "orders")
public class Order {
    @Id
    private
    Integer id;

    private String firstName;
    private String lastName;
    private Long phoneNumber;
    private String address;
    private Integer status;
    private Timestamp creationDate;
    private Timestamp sendingDate;
    private Timestamp recevingDate;
    private String comments;

    public Order() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public Timestamp getSendingDate() {
        return sendingDate;
    }

    public void setSendingDate(Timestamp sendingDate) {
        this.sendingDate = sendingDate;
    }

    public Timestamp getRecevingDate() {
        return recevingDate;
    }

    public void setRecevingDate(Timestamp recevingDate) {
        this.recevingDate = recevingDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
