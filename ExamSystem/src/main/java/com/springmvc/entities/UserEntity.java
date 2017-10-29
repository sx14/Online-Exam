package com.springmvc.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by wzh on 17/01/2017.
 */
@Entity
@Table(name = "tb_member")
public class UserEntity {

    private String memberId;
    private String password;
    private String name;
    private double balance;
    private Date date;
    private String state;
    private double points;
    private String account;
    private String IDnumber;

    public UserEntity() {
    }

    public UserEntity(String memberId, String password, String name, double balance, Date birth, String state, double points, String account, String IDnumber) {
        this.memberId = memberId;
        this.password = password;
        this.name = name;
        this.balance = balance;
        this.date = birth;
        this.state = state;
        this.points = points;
        this.account = account;
        this.IDnumber = IDnumber;
    }

    @Id
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date birth) {
        this.date = date;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getIDnumber() {
        return IDnumber;
    }

    public void setIDnumber(String IDnumber) {
        this.IDnumber = IDnumber;
    }
}
