package com.curriculumapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ReviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review)

        val intent = intent.getExtras()
        //val bundle: Bundle = intent.getBundleExtra("Nome")


        var title = findViewById<TextView>(R.id.reviewTitle);
        if (intent != null) {
            title.setText(intent.getString("Nome"))
        };

    }
}