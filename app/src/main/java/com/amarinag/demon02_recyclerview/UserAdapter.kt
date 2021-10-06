package com.amarinag.demon02_recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserAdapter : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {
    private val users: List<String> = listOf("user #1", "user #2", "user #3", "User #6")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view: View = layoutInflater.inflate(R.layout.item_user, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = users[position]
        holder.tvName.text = user
    }

    override fun getItemCount(): Int = users.size


    class UserViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvName: TextView

        init {
            tvName = view.findViewById(R.id.tv_username)
        }
    }
}