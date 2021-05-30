package com.leandro.blog.service

import com.leandro.blog.model.Post
import com.leandro.blog.repository.PostRepository
import org.springframework.stereotype.Service

@Service
class PostServiceImp(private val repository: PostRepository) : PostService {
    override fun get(id: Int): Post {
       return repository.findById(id).get()
    }

    override fun create(post: Post): Post {
       return repository.save(post)
    }
}