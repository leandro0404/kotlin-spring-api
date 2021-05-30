package com.leandro.blog.controller

import com.leandro.blog.model.Post
import com.leandro.blog.service.PostService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/posts")
class PostController(private var service: PostService) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody post: Post): Post = service.create(post)


    @GetMapping("/{id}")
    fun getById(@PathVariable id: Int): ResponseEntity<Post> =
        ResponseEntity.ok(service.get(id))
}