package com.example.packinglistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {

    private lateinit var tvItemName: TextView
    private lateinit var tvCategory: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        tvItemName = findViewById(R.id.tvItemName)
        tvCategory = findViewById(R.id.tvCategory)

        val itemName = intent.getStringExtra("ITEM_NAME")
        val category = intent.getStringExtra("CATEGORY")

        tvItemName.text = "ItemName: $itemName"
        tvCategory.text = "Category: $category"
    }
}