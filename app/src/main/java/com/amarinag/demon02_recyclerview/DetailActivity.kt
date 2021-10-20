package com.amarinag.demon02_recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.amarinag.demon02_recyclerview.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val userId = intent.getStringExtra("userId")

        val user = (application as App).users.first { it.id == userId }

        binding.tvUserId.text = user.id
        binding.tvFullname.text = "${user.firstName} ${user.lastName}"
    }
}