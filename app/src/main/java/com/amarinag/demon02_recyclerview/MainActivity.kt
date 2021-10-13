package com.amarinag.demon02_recyclerview

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.amarinag.demon02_recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val users = retrieveUsersFromServer()
        val adapter = UserAdapter(users) { user ->
            Log.d("MainActivity", "usuario pulsado: $user")
        }
        binding.rvUsers.adapter = adapter
        binding.rvUsers.layoutManager = LinearLayoutManager(this)



    }


    private fun retrieveUsersFromServer(): MutableList<User> {
        return mutableListOf(
            User(1, "user #1", "https://i.imgur.com/DvpvklR.png"),
            User(
                2,
                "user #2",
                "https://upload.wikimedia.org/wikipedia/commons/3/30/Chuck_Norris_May_2015.jpg"
            ),
            User(3, "user #3", "https://i.imgur.com/DvpvklR.png"),
            User(4, "User #6", "https://i.imgur.com/DvpvklR.png")
        )
    }
}


// step: add dynamic user √
// step: update item add imagen lastName


//   PICASSO
//   GLIDE
//   COIL









