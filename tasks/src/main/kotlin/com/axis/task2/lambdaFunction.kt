package com.axis.task2

import java.util.*

fun main(){
    var sc= Scanner(System.`in`)
    println("enter age to check")
    var age:Int = sc.nextInt()

    //lambda function
    var lambda:(Int) -> String = {if (age<18) "child"
        else if( age>=18 && age<=55) "adult" else "senior citizen"}

   println("the person is ${lambda(age)}")
}