package com.example.classwork

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.*

class ChatAppAdapter(private  val context: Context, private val contactsArrayList: ArrayList<contacts>): Adapter<ChatAppAdapter.ChatAppViewHolder>() {

    class ChatAppViewHolder(itemView: View): ViewHolder(itemView){
        val titleImage: ImageView = itemView.findViewById(R.id.profilePic)
        val profile_name: TextView = itemView.findViewById(R.id.nameText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatAppViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.contacts_profile,parent,false)
        return ChatAppViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ChatAppViewHolder, position: Int) {
        val currentItem = contactsArrayList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.profile_name.text = currentItem.profile_name
    }

    override fun getItemCount(): Int {
        return contactsArrayList.size
    }
}
