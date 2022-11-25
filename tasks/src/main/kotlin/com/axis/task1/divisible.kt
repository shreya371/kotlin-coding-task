package com.axis.task1

fun main() {
    var count:Int=0
    for (i in 1..100){
        if (i%3==0 && i%5==0)
            println("$i is divisible by both 3 and 5")
            count+=1
    }
    println("the count of numbers that are divisible by both 3 and 5 are $count")
}