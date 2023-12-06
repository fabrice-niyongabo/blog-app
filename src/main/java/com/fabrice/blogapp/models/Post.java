package com.fabrice.blogapp.models;


import jakarta.persistence.*;

@Entity // specifies that this is a table and creates our table whenever we start our app
@Table(name = "posts") //changing the name of the table. if not specified jpa will use class name as the table name
public class Post {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false,length = 200)
    private  String title;
    private String description;
    private String content;


    //getters & setters

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getContent() {
        return content;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
