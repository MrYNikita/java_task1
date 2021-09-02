package com.example.demoweb.controller;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PostService {
    public static List<Post> listAllPost() {
        return Arrays.asList(
                new Post("Vini",1),
                new Post("Vidi",142),
                new Post("Vici",987)
        );
    }
}
