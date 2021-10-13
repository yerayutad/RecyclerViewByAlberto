package com.amarinag.demon02_recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.amarinag.demon02_recyclerview.databinding.ItemUserBinding

class UserAdapter(
    private val users: MutableList<User>,
    private val listener: (User) -> Unit
) :
    RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ItemUserBinding = ItemUserBinding.inflate(layoutInflater, parent, false)
        return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = users[position]
        holder.binding.tvUsername.text = user.firstName
        holder.binding.tvLastName.text = user.lastName
        holder.binding.root.setOnClickListener { listener(user) }
    }

    override fun getItemCount(): Int = users.size

    fun addUser(newUser: User) {
        users.add(newUser)
        notifyDataSetChanged()
    }

    class UserViewHolder(val binding: ItemUserBinding) : RecyclerView.ViewHolder(binding.root)
}