package com.axis.task4.service

import com.axis.task4.model.Wrestler
import com.axis.task4.util.WrestlerUtil

class WrestlerService {
    var wrestlerUtil=WrestlerUtil()
    fun addWrestler(wrestler: Wrestler){
        wrestlerUtil.addWrest(wrestler)

    }
    fun displayAllWrestlers(){
        wrestlerUtil.display()

    }
    fun countOfWrestlers(){
        wrestlerUtil.count()
    }
}