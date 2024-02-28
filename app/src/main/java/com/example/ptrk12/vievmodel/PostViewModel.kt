package com.example.ptrk12.vievmodel

import androidx.lifecycle.ViewModel
import com.example.ptrk12.repository.PostRepository
import com.example.ptrk12.repository.PostRepositoryInMemoryImpl

class PostViewModel : ViewModel() {
    private val repository: PostRepository = PostRepositoryInMemoryImpl()
    val data = repository.get()
    fun like() = repository.like()
}
