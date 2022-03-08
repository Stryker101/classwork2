package com.example.classwork


import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

   private lateinit var contactsList: ArrayList<contacts>
   private lateinit var chatAppAdapter: ChatAppAdapter
   private lateinit var newRecyclerView: RecyclerView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadCards()
        newRecyclerView = findViewById(R.id.myRecyclerView)
        newRecyclerView.adapter = chatAppAdapter
        newRecyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun loadCards() {
        contactsList = ArrayList()
        contactsList.add(contacts(R.drawable.a, "Marina Rostova"))
        contactsList.add(contacts(R.drawable.b, "Iggy Blackwell"))
        contactsList.add(contacts(R.drawable.c, "Ricky Martin"))
        contactsList.add(contacts(R.drawable.d, "Inosuke Rengoku"))
        contactsList.add(contacts(R.drawable.e, "Arya Stark"))

        chatAppAdapter = ChatAppAdapter(this, contactsList)

    }


}