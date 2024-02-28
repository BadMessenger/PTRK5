package com.example.ptrk12


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ActionMenuView
import android.widget.TextView
import androidx.activity.viewModels
import androidx.core.graphics.component2
import com.example.ptrk12.databinding.ActivityMainBinding
import com.example.ptrk12.vievmodel.PostViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var w = 0
        var likedByMe = false

        val viewModel: PostViewModel by viewModels()
        viewModel.data.observe(this) { post ->
            with(binding) {
                textView5.text = post.author
                textView6.text = post.published
                textView7.text = post.content
                imageButton19.setImageResource(

                    if (post.likedByMe){
                        likedByMe = true
                        R.drawable.like0n
                    } else {
                        likedByMe = false
                        R.drawable.like0ff
                    }
                )
                binding.imageButton19.setOnClickListener {
                    if (likedByMe) {
                        w--
                    } else {
                        w++
                    }
                    likedByMe = !likedByMe
                    imageButton19.setImageResource(
                        if (likedByMe) {
                            R.drawable.like0n
                        } else {
                            R.drawable.like0ff
                        }
                    )
                    textView8.text = w.toString()
                }
                var q = 0
                binding.imageButton2.setOnClickListener {
                    q++
                    textView9.text = q.toString()
                }
            }

        }

        binding.imageButton19.setOnClickListener {
            viewModel.like()
        }

    }
}









