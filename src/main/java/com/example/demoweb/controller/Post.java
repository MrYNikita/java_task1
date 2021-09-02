package com.example.demoweb.controller;

public class Post {
    private String text;
    private Integer likes;

    Post(String text,Integer likes) {
        this.text = text;
        this.likes = likes;
    }

    public Integer getLikes() {
        return likes;
    }
    public String getText() {
        return text;
    }
}
