package com.fabrice.blogapp.controllers;

import com.fabrice.blogapp.exceptions.ResourceNotFoundException;
import com.fabrice.blogapp.models.Post;
import com.fabrice.blogapp.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("")
    public List<Post> getAllPosts(){
        List<Post> posts = postRepository.findAll();
        return posts;
    }

    //getting single post
    @GetMapping("/{id}")
//    public Post getPost(@PathVariable long id){    => because our variable is the same as the path variable
    public Post getPost(@PathVariable(name = "id") long postId){ //here variable names are different that is why we have to specify the name of the pathvariable
        Post post  = postRepository.findById(postId).orElseThrow(() -> new ResourceNotFoundException("post"));
        return post;
    }
}
