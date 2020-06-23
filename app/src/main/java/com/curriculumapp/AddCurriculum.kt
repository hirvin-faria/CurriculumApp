package com.curriculumapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class AddCurriculum : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_curriculum)

        // Captura dos campos de texto
        val name = findViewById<EditText>(R.id.editTextName);
        val idade = findViewById<EditText>(R.id.editTextIdade);
        val objetivo = findViewById<EditText>(R.id.editTextObjetivo);
        val formacao = findViewById<EditText>(R.id.editTextFormacao);
        val experiencia = findViewById<EditText>(R.id.editTextExperiencia);


        // Captura o botão de cadastro de curriculo
        val ButtonAddCurriculum = findViewById<Button>(R.id.buttonAdd)

        //Adiciona um listener do tipo onClick para o Botão
        ButtonAddCurriculum.setOnClickListener {

            //Criacao do bundle de dados
            val dataBundle = Bundle()
            dataBundle.putString("name", name.text.toString())
            dataBundle.putString("idade", idade.text.toString())
            dataBundle.putString("objetivo", objetivo.text.toString())
            dataBundle.putString("formacao", formacao.text.toString())
            dataBundle.putString("experiencia", experiencia.text.toString())

            //Criacao da intent
            val intentGoToReview = Intent(this, ReviewActivity::class.java)


            //Adicionando bundle a intent e iniciando prox activity
            intentGoToReview.putExtras(dataBundle)
            startActivity(intentGoToReview)
        }
    }
}