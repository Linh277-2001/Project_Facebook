package com.example.facebook.service;

import com.example.facebook.model.Posts;
import com.example.facebook.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;
    public List<Posts> getAllPost(){
        return postRepository.findAll();
    }
}