package com.example.myfirstapp

fun main() {
    var n = arrayListOf<Double>()
    n.add(1.1)
    n.add(2.1)
    n.add(3.1)
    n.add(4.1)
    n.add(5.1)
    var sum=0.0
    for (num in n){
        sum+=num
    }
    print(sum/n.size)
}
