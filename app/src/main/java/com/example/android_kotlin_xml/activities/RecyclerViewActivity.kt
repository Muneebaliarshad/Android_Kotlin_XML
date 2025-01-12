package com.example.android_kotlin_xml.activities

import Supplier
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android_kotlin_xml.adapters.ListAdapter
import com.example.android_kotlin_xml.R

class RecyclerViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        val adapter = ListAdapter(Supplier.listData)

        val recyclerView: RecyclerView = findViewById(R.id.listRecyclerView)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = layoutManager
    }


}