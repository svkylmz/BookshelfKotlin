package com.svkylmz.bookshelfkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.svkylmz.bookshelfkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var bookList: ArrayList<Book>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Initialize
        bookList = ArrayList<Book>()

        bookList.add(Book("Dava", "Franz Kafka", "100", R.drawable.dava))
        bookList.add(Book("Dönüşüm", "Franz Kafka", "80", R.drawable.donusum))
        bookList.add(Book("Oblomov", "Ivan Aleksandroviç Gançarov", "350", R.drawable.oblomov))
        bookList.add(Book("Satranç", "Stefan Zweig", "120", R.drawable.satranc))
        bookList.add(Book("İnsan Neyle Yaşar?", "L.N. Tolstoy", "120", R.drawable.insan_neyle_yasar))
        bookList.add(Book("Yeraltından Notlar", "Fyodor Mihayloviç Dostoyevski", "120", R.drawable.yeraltindan_notlar))

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = BookAdapter(bookList)
    }
}