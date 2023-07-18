package com.example.burcrehberi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class HoroscopeBaseAdapter(context: Context, allHoroscopeInfo: ArrayList<Horoscope>): BaseAdapter() {
    private var allHoroscopes: ArrayList<Horoscope>
    private val context: Context
    init {
        this.allHoroscopes = allHoroscopeInfo
        this.context = context
    }
    override fun getCount(): Int {
        return allHoroscopes.size
    }

    override fun getItem(p0: Int): Any {
        return allHoroscopes[p0]
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var oneLineLayout = p1
        if (oneLineLayout == null){
            val inflater = LayoutInflater.from(context)
            oneLineLayout = inflater.inflate(R.layout.one_line_layout, p2, false)
        }
        println("Name: ${allHoroscopes[p0].horoscopeName}")
        oneLineLayout?.findViewById<ImageView>(R.id.imageHoroscope)?.setImageResource(allHoroscopes[p0].horoscopeIcon)
        oneLineLayout?.findViewById<TextView>(R.id.textViewHoroscope)?.text = allHoroscopes[p0].horoscopeName
        oneLineLayout?.findViewById<TextView>(R.id.textViewHoroscopeHint)?.text = allHoroscopes[p0].horoscopeCalender
        return oneLineLayout!!
    }
}



