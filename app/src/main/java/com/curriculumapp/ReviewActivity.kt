package com.curriculumapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ReviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review)

        //Obtendo campos de textview da revisao
        val revName = findViewById<TextView>(R.id.revTextViewName)
        val revIdade = findViewById<TextView>(R.id.revTextViewIdade)
        val revObjetivo = findViewById<TextView>(R.id.revTextViewObjetivo)
        val revFormacao = findViewById<TextView>(R.id.revTextViewFormacao)
        val revExperiencia = findViewById<TextView>(R.id.revTextViewExperiencia)

        //Resposta do intent
        val respoBundle = intent.getExtras()


        if (respoBundle != null) {
            revName.setText("Nome: ${respoBundle.getString("name")}")
            revIdade.setText("Idade: ${respoBundle.getString("idade")}")
            revObjetivo.setText("Objetivo: ${respoBundle.getString("objetivo")}")
            revFormacao.setText("Formação: ${respoBundle.getString("formacao")}")
            revExperiencia.setText("Experiência: ${respoBundle.getString("experiencia")}")
        };


        val revBtnAddConfirm = findViewById<Button>(R.id.revBtnAddConfirm)

        //Adiciona um listener do tipo onClick para o Botão
        revBtnAddConfirm.setOnClickListener {

            //Criacao da intent
            val intentFinishAdd = Intent(this, MainActivity::class.java)
            startActivity(intentFinishAdd)
        }
    }
}