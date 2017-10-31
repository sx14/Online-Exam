package se.exam.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by wzh on 17/01/2017.
 */
@Entity
@Table(name = "user")
public class UserEntity {
    private int uid;
    private String username;
    private String password;
    private String name;
    private int userType;

    public UserEntity() {
    }

    public UserEntity(String username, String password, String name, int userType) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.userType = userType;
    }

    @Id
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
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
}
