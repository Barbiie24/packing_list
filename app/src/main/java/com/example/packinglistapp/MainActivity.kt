package com.example.packinglistapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    private lateinit var etItemName: EditText
    private lateinit var etCategory: EditText
    private lateinit var btnAddItem: Button
    private lateinit var btnViewItems: Button

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etItemName = findViewById(R.id.etItemName)
        etCategory = findViewById(R.id.etCategory)
        btnAddItem = findViewById(R.id.btnAddItem)
        btnViewItems = findViewById(R.id.btnViewItems)

        btnAddItem.setOnClickListener {
            val itemName = etItemName.text.toString()
            val category = etCategory.text.toString()
            if (itemName.isNotEmpty() && category.isNotEmpty()) {
                val intent = Intent(this, DetailsActivity::class.java)
                intent.putExtra("ITEM_NAME", itemName)
                intent.putExtra("CATEGORY", category)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            }
        }

        btnViewItems.setOnClickListener {
            //Navigate to another activity to view the list (not implemented here)
        }
    }

}

