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
        val odhaczanie=findViewById<RadioButton>(R.id.odhaczanie)

        val wedliny= findViewById<TextView>(R.id.wedliny)
        val warzywa= findViewById<TextView>(R.id.warzywa)
        val pieczywo= findViewById<TextView>(R.id.pieczywo)

        val szynka = findViewById<Chip>(R.id.szynka)
        val salami = findViewById<Chip>(R.id.salami)
        val kielbasa= findViewById<Chip>(R.id.kielbasa)

        val Burak = findViewById<Chip>(R.id.Burak)
        val Cebula= findViewById<Chip>(R.id.Cebula)
        val Ziemniak = findViewById<Chip>(R.id.ziemniak)
        val Salata= findViewById<Chip>(R.id.salata)

        val bagietka = findViewById<Chip>(R.id.bagietka)
        val croissant = findViewById<Chip>(R.id.croissant)
        val chleb =findViewById<Chip>(R.id.chleb)

        wedliny.visibility = View.GONE
        warzywa.visibility = View.GONE
        pieczywo.visibility = View.GONE

        szynka.visibility = View.GONE
        salami.visibility = View.GONE
        kielbasa.visibility = View.GONE

        Ziemniak.visibility = View.GONE
        Burak.visibility = View.GONE
        Cebula.visibility = View.GONE
        Salata.visibility = View.GONE

        bagietka.visibility = View.GONE
        croissant.visibility = View.GONE
        chleb.visibility = View.GONE



    }
}