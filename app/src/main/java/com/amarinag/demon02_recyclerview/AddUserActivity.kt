package com.amarinag.demon02_recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.amarinag.demon02_recyclerview.databinding.ActivityAddUserBinding
import com.squareup.picasso.Picasso
import java.util.*

class AddUserActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Picasso.get()
            .load("https://i.imgur.com/DvpvklR.png")
            .placeholder(R.mipmap.ic_launcher)
            .into(binding.ivImage1)
        Picasso.get()
            .load("https://upload.wikimedia.org/wikipedia/commons/3/30/Chuck_Norris_May_2015.jpg")
            .placeholder(R.mipmap.ic_launcher)
            .into(binding.ivImage2)

        binding.rbImage1.setOnCheckedChangeListener { buttonView, isChecked ->

        }
        binding.rbImage1.setOnCheckedChangeListener { buttonView, isChecked ->
            binding.rbImage2.isChecked = !isChecked
        }
        binding.rbImage2.setOnCheckedChangeListener { buttonView, isChecked ->
            binding.rbImage1.isChecked = !isChecked
        }

        binding.btnAddUser.setOnClickListener {
            val firstName = binding.tietUsername.text.toString()
            val lastName = binding.tietLastname.text.toString()
            val imageUrl: String = if (binding.rbImage1.isChecked) {
                "https://i.imgur.com/DvpvklR.png"
            } else {
                "https://upload.wikimedia.org/wikipedia/commons/3/30/Chuck_Norris_May_2015.jpg"
            }

            val newUser = User(UUID.randomUUID().toString(), firstName, lastName, imageUrl)

            val users = (application as App).users
            users.add(newUser)

            binding.tietUsername.text = null
            binding.tietLastname.text = null
            binding.tietUsername.requestFocus()
        }


    }
}