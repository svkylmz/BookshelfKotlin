package com.svkylmz.bookshelfkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.svkylmz.bookshelfkotlin.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent
        //casting
        val selectedBook = intent.getSerializableExtra("book") as Book

        binding.bookImage.setImageResource(selectedBook.image)
        binding.bookName.text = selectedBook.name
        binding.authorName.text = selectedBook.author
        binding.pageTextView.text = selectedBook.page
    }
}