package edu.itsco.numeromayor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var numero1 : EditText
    lateinit var numero2 : EditText
    lateinit var lbresultado : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mayor : Button = findViewById(R.id.btn_mayor)

        numero1 = findViewById(R.id.txt1)
        numero2 = findViewById(R.id.txt2)
        lbresultado = findViewById(R.id.lbresultado)

        mayor.setOnClickListener { view ->
        val n1 : Float = numero1.text.toString().toFloat()
        val n2 : Float = numero2.text.toString().toFloat()
        if (n1>n2){
            lbresultado.text = "El numero mayor es: $n1"
        }
        else{
            lbresultado.text = "El numero mayor es: $n2"
        }
        }
    }

}