package com.axis.task4.util

import com.axis.task4.model.Wrestler

class WrestlerUtil {
    var wrestlerList= mutableListOf<Wrestler>()
    init{
        wrestlerList.add(Wrestler("wrest1",30,60,90))
        wrestlerList.add(Wrestler("wrest2",40,65,100))
        wrestlerList.add(Wrestler("wrest3",36,50,85))
        wrestlerList.add(Wrestler("wrest4",51,62,120))
        wrestlerList.add(Wrestler("wrest5",29,61,80))
    }

    fun addWrest(wrestler: Wrestler){
        wrestlerList.add(wrestler)
        println("wrestler added to list successfully")
    }

    fun display(){
        for (wrestler in wrestlerList){
            println(wrestler.toString())

        }
    }

    fun count(){
        var countList=wrestlerList.count{it.age > 35}
        println("count of wrestlers whose age is > 35 : $countList")
    }

}