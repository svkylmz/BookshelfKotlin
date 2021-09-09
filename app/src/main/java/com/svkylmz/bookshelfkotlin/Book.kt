package com.svkylmz.bookshelfkotlin

import java.io.Serializable
//Serializable is necessary to send classes or lists with putExtra function
//Serializable interface serialize classes(lists) to normal data
//check out BookAdapter class line 26
data class Book (val name: String, val author: String, val page: String, val image: Int) : Serializable{
}