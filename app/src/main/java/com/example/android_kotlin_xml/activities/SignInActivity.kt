package com.example.android_kotlin_xml.activities

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.android_kotlin_xml.R
import com.example.android_kotlin_xml.extensions.showToast

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val bundle: Bundle? = intent.extras
        bundle?.getString("name")?.let { showToast(it) }
    }

    fun signInButtonAction(view: View?) {
        val userName = findViewById<EditText>(R.id.editTextUserName).text.toString()
        showToast(userName)
    }
}