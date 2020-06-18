package com.curriculumapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ButtonAddCurriculum = findViewById<FloatingActionButton>(R.id.btn_add_curriculum)
        ButtonAddCurriculum.setOnClickListener {
            val intentAddCurriculum = Intent(this, AddCurriculum::class.java)
            // start your next activity
            startActivity(intentAddCurriculum)
        }
    }

    fun addCurriculum(view: View){
        val intentAddCurriculim = Intent(this, AddCurriculum::class.java)
        // start your next activity
        startActivity(intentAddCurriculim)
    }
}