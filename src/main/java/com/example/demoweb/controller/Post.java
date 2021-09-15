package com.example.demoweb.controller;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;

    Post(String text, Date creationDate,Integer likes) {
        this.text = text;
        this.likes = likes;
        this.creationDate = creationDate;
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
}
