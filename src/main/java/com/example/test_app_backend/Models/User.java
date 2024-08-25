package com.example.test_app_backend.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("authors")
public class User {

    @Id
    private long id;
    private String firstName;
    private String lastName;
    private int pages;  // Previously 'age'
    private String title;  // Previously 'occupation'

    // Constructors, getters, and setters
    public User() {}

    public User(long id, String firstName, String lastName, int pages, String title) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pages = pages;
        this.title = title;
    }

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}