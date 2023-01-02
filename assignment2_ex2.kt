package com.example.myfirstapp

fun main() {
    var temp = 35
    while (temp>10){
        when(temp){
            30-> println("it's Hot")
            20-> println("it's Comfy")
            15-> println("its Cold")
            else-> println(temp)
        }
        temp--
    }
}
