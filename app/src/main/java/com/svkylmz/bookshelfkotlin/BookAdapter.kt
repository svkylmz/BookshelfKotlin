package com.svkylmz.bookshelfkotlin

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.svkylmz.bookshelfkotlin.databinding.RecyclerRowBinding

class BookAdapter(val bookList: ArrayList<Book>) : RecyclerView.Adapter<BookAdapter.BookHolder>() {

    class BookHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookHolder {
        //binding with View Binding to recycler_row layout
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BookHolder(binding)
    }

    override fun onBindViewHolder(holder: BookHolder, position: Int) {
        //get and show data on recyclerView
        holder.binding.recyclerViewTextView.text = bookList.get(position).name
        //what will happen after binding and click the data
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailsActivity::class.java)
            intent.putExtra("book", bookList.get(position))   //serializable    //book is just a keyword
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        //how many item will return
        return bookList.size
    }
}