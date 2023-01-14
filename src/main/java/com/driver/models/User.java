package com.driver.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    @Column(unique = true,nullable = false)
    private String userName;
    private String password;
    private String firstName;
    private String lastname;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Blog> listOfBlog;

    public User() {
    }

    public User(String userName, String password, String firstName, String lastname) {
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<Blog> getListOfBlog() {
        return listOfBlog;
    }

    public void setListOfBlog(List<Blog> listOfBlog) {
        this.listOfBlog = listOfBlog;
    }
}