package com.example.demoweb.controller;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Date;

@Service public class PostService {
    public List<Post> listAllPost() {
        return Arrays.asList(
                new Post("Vini",new Date(),1),
                new Post("Vidi",new Date(),142),
                new Post("Vici",new Date(),987)
        );
    }
}
