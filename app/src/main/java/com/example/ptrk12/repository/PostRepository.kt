package com.example.ptrk12.repository

import androidx.lifecycle.LiveData
import com.example.ptrk12.dto.Post

interface PostRepository {
    fun get(): LiveData<Post>
    fun like()
}