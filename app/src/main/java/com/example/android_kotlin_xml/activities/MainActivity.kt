package com.example.android_kotlin_xml.activities

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.android_kotlin_xml.R


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listViewHandling()
    }

    private fun listViewHandling() {
        val listView: ListView = findViewById(R.id.listView)
        val items =
            listOf("Sign In View (Simple Controls)", "Social On Share (Text)", "Recycler View")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            when (position) {
                0 -> {
                    val intent = Intent(this, SignInActivity::class.java)
                    intent.putExtra("name", "Sign In")
                    startActivity(intent)
                }

                1 -> {
                    val intent = Intent()
                    intent.action = Intent.ACTION_SEND
                    intent.type = "text/plain"
                    intent.putExtra(Intent.EXTRA_TEXT, "This is a dummy Text")
                    startActivity(Intent.createChooser(intent, "Share To"))
                }

                2 -> {
                    val intent = Intent(this, RecyclerViewActivity::class.java)
                    startActivity(intent)
                }

                else -> {
                    print("x is neither 1 nor 2")
                }
            }
        }
    }

}