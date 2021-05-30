package com.leandro.blog.repository

import com.leandro.blog.model.Post
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository  : JpaRepository<Post, Int> {

}