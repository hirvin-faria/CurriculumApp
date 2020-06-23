package com.curriculumapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AddCurriculum : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_curriculum)

        val ButtonAddCurriculum = findViewById<Button>(R.id.buttonAdd)

        ButtonAddCurriculum.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("Nome", "Hirvin Faria")
            val intentGoToReview = Intent(this, ReviewActivity::class.java)
            intentGoToReview.putExtras(bundle)
            startActivity(intentGoToReview)
        }
    }
}