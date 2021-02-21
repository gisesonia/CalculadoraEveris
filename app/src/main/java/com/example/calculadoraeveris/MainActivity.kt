package com.example.calculadoraeveris

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.calculadoraeveris.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        val botaoCalcular = binding!!.btnCalcular
        val resultado = binding!!.resultado

        binding!!.btnCalcular.setOnClickListener {
            val nota1 = Integer.parseInt(binding!!.nota1.text.toString())
            val nota2 = Integer.parseInt(binding!!.nota2.text.toString())
            val media = (nota1 + nota2)/2
            val faltas = Integer.parseInt(binding!!.faltas.text.toString())

            if(media >= 6 && faltas <=10) {
                resultado.setText("Aluno foi Aprovado\nNota Final: $media\nFaltas:$faltas")
                resultado.setTextColor(Color.GREEN)
            } else {
                resultado.setText("Aluno foi Reprovado\nNota Final: $media\nFaltas:$faltas")
                resultado.setTextColor(Color.RED)
            }
        }
    }
}