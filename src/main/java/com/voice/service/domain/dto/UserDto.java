package com.voice.service.domain.dto;

import com.voice.service.instructure.Entity.User;
import com.voice.service.instructure.Enum.Sex;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Date;

public class UserDto {
    private String username;
    private String password;
    private String email;
    private String telephone;
    private Sex sex;
    private int age;
    private Date birthday;
    private String realname;
    private String nickname;

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
    //@Enumerated
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
    public User ToEntity(){
        return new User(this.username,this.password,this.email,this.telephone,this.sex,this.age,this.birthday,this.realname,this.nickname);
    }
}
