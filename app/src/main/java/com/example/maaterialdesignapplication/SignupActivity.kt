package com.example.maaterialdesignapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
    }

    fun OpenSignInPage(view: View) {
        val intent= Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}