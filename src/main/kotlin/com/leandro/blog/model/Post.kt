package com.leandro.blog.model

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Post
    (
    @Id @GeneratedValue
    var id: Int,
    var title: String,
    var description: String
)
