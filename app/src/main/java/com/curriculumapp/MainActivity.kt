package com.curriculumapp

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton
;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // função que verifica busca no repositório de curriculos e verifica se existe algum curriculo cadastrado.
        findCurriculum()


        val ButtonAddCurriculum = findViewById<FloatingActionButton>(R.id.btn_add_curriculum)
        ButtonAddCurriculum.setOnClickListener {
            goAddCurriculum()
        }
    }

    fun findCurriculum() {
        // instancia um repositório SharedPreferences
        val curriculum: SharedPreferences = getSharedPreferences("CurriculumInfo", 0)

        // Realiza a busca no repositório
        var existCurriculum = curriculum.getBoolean("existCurriculum", false)
        var name = curriculum.getString ("name", "")
        var idade = curriculum.getString("idade", "")
        var objetivo = curriculum.getString("objetivo", "")


        // Verifica se existe um curriculo cadastrado
        if(existCurriculum == true){
            var mainCurriculum = findViewById<TextView>(R.id.mainCuriculumTextView)
            var mainName = findViewById<TextView>(R.id.mainNameTextView)
            var mainIdade = findViewById<TextView>(R.id.mainIdadeTextView)
            var mainObjetivo = findViewById<TextView>(R.id.mainObjetivoTextView)
            var editLabelCurriculum = findViewById<TextView>(R.id.editCurriculumTextView)


            mainCurriculum.setText("Você tem um curriculo cadastrado!")
            mainName.setText(name.toString())
            mainIdade.setText(idade.toString())
            mainObjetivo.setText(objetivo.toString())

            //Ativa a visibilidade da instrução de adição
            editLabelCurriculum.visibility = View.VISIBLE
        }
    }


    // Função que realiza a intent na main activity
    fun goAddCurriculum(){
        val intentAddCurriculum = Intent(this, AddCurriculum::class.java)

        //Inicia a activity de cadastro de currículo
        startActivity(intentAddCurriculum)
    }
}

