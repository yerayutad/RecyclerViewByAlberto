package com.amarinag.demon02_recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.amarinag.demon02_recyclerview.R
import com.amarinag.demon02_recyclerview.databinding.ItemUserBinding
import com.amarinag.demon02_recyclerview.model.User
import com.squareup.picasso.Picasso

class UserAdapter(
    private val users: MutableList<User>,
    private val listener: (User) -> Unit
) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ItemUserBinding = ItemUserBinding.inflate(layoutInflater, parent, false)
        return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = users[position]
        holder.binding.tvUsername.text = user.firstName
        holder.binding.tvLastName.text = user.lastName
        Picasso.get()
            .load(user.imageUrl)
            .placeholder(R.mipmap.ic_launcher)
            .into(holder.binding.ivAvatar)
        holder.binding.root.setOnClickListener { listener(user) }
    }

    override fun getItemCount(): Int = users.size

    fun refreshUsers() {
        notifyDataSetChanged()
    }

    class UserViewHolder(val binding: ItemUserBinding) : RecyclerView.ViewHolder(binding.root)
}