package com.example.demo.domain.model.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "clientes", schema = "administracion_clientes")
public class Clientes implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    @Id
    @Column(name = "shared_key", unique = true, nullable = false, length = 50)
    private String shared_key;

    @Column(name = "business_id")
    private String business_id;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "date_add")
    private Date date_add;

    @Column(name = "start_date")
    private Date start_date;

    @Column(name = "end_date")
    private Date end_date;

    public Clientes() {
    }

    public String getShared_key() {
        return shared_key;
    }

    public void setShared_key(String shared_key) {
        this.shared_key = shared_key;
    }

    public String getBusiness_id() {
        return business_id;
    }

    public void setBusiness_id(String business_id) {
        this.business_id = business_id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDate_add() {
        return date_add;
    }

    public void setDate_add(Date date_add) {
        this.date_add = date_add;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }
}

