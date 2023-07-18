package com.example.burcrehberi

import java.io.Serializable

data class Horoscope(
    var horoscopeName: String,
    var horoscopeCalender: String,
    var horoscopeIcon: Int,
    var horoscopeBackground: Int,
    var horoscopeFeature: String
    ): Serializable