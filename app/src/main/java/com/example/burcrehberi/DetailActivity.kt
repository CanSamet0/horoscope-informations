package com.example.burcrehberi


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView



class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val position = intent.extras?.getInt("position") as Int
        val allHoroscopeFeature = intent.extras?.getStringArrayList("allHoroscopeFeatures") as ArrayList<Horoscope>
        val textViewHoroscopeFeature = findViewById<TextView>(R.id.textViewHoroscopeFeature)
        textViewHoroscopeFeature.text = allHoroscopeFeature[position].horoscopeFeature
        val header = findViewById<ImageView>(R.id.header)
        header.setImageResource(allHoroscopeFeature[position].horoscopeBackground)
        val textViewHoroscopeName = findViewById<TextView>(R.id.textViewHoroscopeName)
        textViewHoroscopeName.text = allHoroscopeFeature[position].horoscopeName
    }
}