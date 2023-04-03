package com.example.listazak

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.chip.Chip

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dodawanie=findViewById<RadioButton>(R.id.dodawanie)
        val odhacznie=findViewById<RadioButton>(R.id.odhaczanie)

        val pieczywo= findViewById<TextView>(R.id.textView)
        pieczywo.visibility = View.GONE
        val bagietka = findViewById<Chip>(R.id.bagietka)
        bagietka.visibility = View.GONE
        val croissant = findViewById<Chip>(R.id.croissant)
        croissant.visibility = View.GONE
        val chleb =findViewById<Chip>(R.id.chleb)
        chleb.visibility = View.GONE

        val wedliny= findViewById<TextView>(R.id.textView2)
        wedliny.visibility = View.GONE
        val szynka = findViewById<Chip>(R.id.szynka)
        szynka.visibility = View.GONE
        val salami = findViewById<Chip>(R.id.salami)
        salami.visibility = View.GONE
        val kielbasa= findViewById<Chip>(R.id.kielbasa)
        kielbasa.visibility = View.GONE

        val warzywa= findViewById<TextView>(R.id.textView3)
        warzywa.visibility = View.GONE
        val Ziemniak = findViewById<Chip>(R.id.ziemniak)
        Ziemniak.visibility = View.GONE
        val Marchewka = findViewById<Chip>(R.id.marchewka)
        Marchewka.visibility = View.GONE
        val Kukurydza= findViewById<Chip>(R.id.kukurydza)
        Kukurydza.visibility = View.GONE
        val Salata= findViewById<Chip>(R.id.salata)
        Salata.visibility = View.GONE


        }
}