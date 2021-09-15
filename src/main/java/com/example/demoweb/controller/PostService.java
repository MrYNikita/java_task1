package com.example.demoweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Date;

@Service public class PostService {
    List<Post> posts = new ArrayList<>();

    public List<Post> listAllPost() {
        return posts;
        /*return Arrays.asList(
                new Post("Vini",new Date(),1),
                new Post("Vidi",new Date(),142),
                new Post("Vici",new Date(),987)
        );*/
    }
    public void create(String text) {
        posts.add(new Post(text,new Date(),0));
    }
}
