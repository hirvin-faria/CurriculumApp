package com.curriculumapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AddCurriculum : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_curriculum)

        val ButtonAddCurriculum = findViewById<Button>(R.id.buttonAdd)
        ButtonAddCurriculum.setOnClickListener {
            val intentGoToReview = Intent(this, ReviewActivity::class.java)
            startActivity(intentGoToReview)
        }
    }
}