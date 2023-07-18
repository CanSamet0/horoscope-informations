package com.example.burcrehberi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    private lateinit var allHoroscopeInfo: ArrayList<Horoscope>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        prepareDataSource()
        val listHoroscope = findViewById<ListView>(R.id.listHoroscopes)
        val myBaseAdapter = HoroscopeBaseAdapter(this, allHoroscopeInfo)
        listHoroscope.adapter = myBaseAdapter
        listHoroscope.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this@MainActivity, DetailActivity::class.java)
            intent.putExtra("position", position)
            intent.putExtra("allHoroscopeFeatures", allHoroscopeInfo)
            startActivity(intent)
        }
    }

    private fun prepareDataSource() {
        allHoroscopeInfo = ArrayList(12)
        val horoscopes = resources.getStringArray(R.array.horoscopes)
        val horoscopeCalenders = resources.getStringArray(R.array.horoscopeCalender)
        val horoscopeIcons = arrayOf(
            R.drawable.aries1,
            R.drawable.taurus2,
            R.drawable.gemini3,
            R.drawable.cancer4,
            R.drawable.leo5,
            R.drawable.virgo6,
            R.drawable.libra7,
            R.drawable.scorpio8,
            R.drawable.sagittarius9,
            R.drawable.capricorn10,
            R.drawable.aquarius11,
            R.drawable.pisces12,
        )
        val horoscopeBackgroundIcon = arrayOf(
            R.drawable.aries_background,
            R.drawable.taurus_background,
            R.drawable.gemini_background,
            R.drawable.cancer_background,
            R.drawable.leo_background,
            R.drawable.virgo_background,
            R.drawable.libra_background,
            R.drawable.scorpio_background,
            R.drawable.sagittarius_background,
            R.drawable.capricorn_background,
            R.drawable.aquarius_background,
            R.drawable.pisces_background,
        )
        val horoscopeFeatures = resources.getStringArray(R.array.horoscopeFeatures)
        for (i in 0..11){
            val horoscopeAddInArrayList = Horoscope(
                horoscopes[i],
                horoscopeCalenders[i],
                horoscopeIcons[i],
                horoscopeBackgroundIcon[i],
                horoscopeFeatures[i]
            )
            allHoroscopeInfo.add(horoscopeAddInArrayList)
        }
    }
}