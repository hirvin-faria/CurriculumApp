package com.curriculumapp

import android.content.Intent
import android.content.SharedPreferences
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

        // preenche os campos de revisão
        if (respoBundle != null) {
            revName.setText("Nome: ${respoBundle.getString("name")}")
            revIdade.setText("Idade: ${respoBundle.getString("idade")}")
            revObjetivo.setText("Objetivo: ${respoBundle.getString("objetivo")}")
            revFormacao.setText("Formação: ${respoBundle.getString("formacao")}")
            revExperiencia.setText("Experiência: ${respoBundle.getString("experiencia")}")
        };


        val revBtnAddConfirm = findViewById<Button>(R.id.revBtnAddConfirm)

        // adiciona um listener do tipo onClick para o Botao
        revBtnAddConfirm.setOnClickListener {

            // criacao da intent
            if (respoBundle != null) {
                saveCurriculum(respoBundle)
            }
            val intentFinishAdd = Intent(this, MainActivity::class.java)
            startActivity(intentFinishAdd)
        }


    }


    //Função que salva o curriculo no repositório
    fun saveCurriculum(respoBundle: Bundle ) {

        // instancia um novo repositório
        val curriculum:SharedPreferences = getSharedPreferences("CurriculumInfo", 0)

        // instancia um editor para o repositório
        val editor = curriculum.edit()

        // cadastro dos dados no repositório
        editor.putBoolean("existCurriculum", true)
        if (respoBundle != null) {
            editor.putString("name", respoBundle.getString("name") )
            editor.putString("idade", respoBundle.getString("idade") )
            editor.putString("objetivo", respoBundle.getString("objetivo") )
            editor.putString("formacao", respoBundle.getString("formacao") )
            editor.putString("experiencia", respoBundle.getString("experiencia") )
            editor.apply()
        }
    }
}