package com.nabil.daduapp

class Dice (val number: Int) {

    fun roll(): Int{
        return (1..number).random()
    }


}
