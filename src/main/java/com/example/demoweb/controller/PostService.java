package com.example.demoweb.controller;

import com.example.demoweb.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service public class PostService {
    List<Post> posts = new ArrayList<>();
    @Autowired
    PostRepository postRepository;

    public Iterable<Post> listAllPost() {
        return postRepository.findAll();
    }
    public void create(String text) {
        Post post = new Post(null, text);
        postRepository.save(post);
    }
}
