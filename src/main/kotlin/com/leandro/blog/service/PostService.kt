package com.leandro.blog.service

import com.leandro.blog.model.Post

interface PostService {
    fun get(id: Int) : Post
    fun create(post: Post) : Post
}