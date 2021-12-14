package com.example.gharmai.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.gharmai.R

class LoginActivity : AppCompatActivity() {
    private lateinit var DonthaveAccount: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        DonthaveAccount = findViewById(R.id.dnthave)

        DonthaveAccount.setOnClickListener {
            var intent = Intent(this@LoginActivity, UserRegister::class.java)
            startActivity(intent)
        }
    }
}