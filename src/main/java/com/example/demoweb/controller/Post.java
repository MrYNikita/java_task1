package com.example.demoweb.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Post implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String text;
    private Integer likes = 0;
    private Date creationDate = new Date();

    Post () {

    }
    Post(Long id, String text) {
        this.id = id;
        this.text = text;
    }

    public Integer getLikes() {
        return likes;
    }
    public String getText() {
        return text;
    }
    public Date getCreationDate() {
        return creationDate;
    }
    public Long getId() { return id; }

    public void setLikes(int i) { likes = i; }
}
