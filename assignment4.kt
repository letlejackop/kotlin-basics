package com.example.myfirstapp

fun main() {
    println(c(10.0,5.0,"+"))
    println(c(10.0,5.0,"-"))
    println(c(10.0,5.0,"*"))
    println(c(10.0,5.0,"/"))
    c(10.0,5.0,"ahmed")
}
fun c(D1:Double,D2:Double,opr:String = "+"):Double{
    when(opr){
        "+"-> return D1+D2
        "-"-> return D1-D2
        "*"-> return D1*D2
        "/"-> return D1/D2
        else -> println("Please pass + or - or * or /")
    }
    return 0.0
}
