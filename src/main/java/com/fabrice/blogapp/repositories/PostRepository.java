package com.fabrice.blogapp.repositories;

import com.fabrice.blogapp.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
    //adding all sql commands to post table/entity
    //<Post,Long> => table name , type of the primary key of the the table
}
