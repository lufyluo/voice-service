package com.voice.service.instructure.Entity;

import com.voice.service.instructure.Enum.Sex;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user")
public class User extends BaseEntity {

    private String username;
    private String password;
    private String email;
    private String telephone;
    @Column(length = 8)
    private Sex sex;
    private int age;
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthday;
    private String realname;
    private String nickname;

    public User() {

    }

    public User(String username, String password, String email, String telephone, Sex sex, int age, Date birthday, String realname, String nickname) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.telephone = telephone;
        this.sex = sex;
        this.age = age;
        this.birthday = birthday;
        this.realname = realname;
        this.nickname = nickname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
