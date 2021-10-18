package com.amarinag.demon02_recyclerview

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.amarinag.demon02_recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: UserAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)











        val users = (application as App).users
        adapter = UserAdapter(users) { user ->
            Log.d("MainActivity", "usuario pulsado: ${user.id}")
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("userId", user.id)
            startActivity(intent)
        }
        binding.rvUsers.adapter = adapter
        binding.rvUsers.layoutManager = LinearLayoutManager(this)

        binding.btnAddUser.setOnClickListener {
            val intent = Intent(this, AddUserActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        adapter.refreshUsers()
    }
}


// step: add dynamic user √
// step: update item add imagen lastName


//   PICASSO √
//   GLIDE √
//   COIL √









