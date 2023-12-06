package com.fabrice.blogapp.controllers;

import com.fabrice.blogapp.models.Post;
import com.fabrice.blogapp.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {

    //getting access to sql methods within this controller
    //we do that by connecting the user repository
    @Autowired
    private PostRepository postRepository;

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Post addNewPost(@RequestBody Post newPost){
        return postRepository.save(newPost);
    }
}
