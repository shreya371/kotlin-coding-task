package com.axis.task3.app

import com.axis.task3.model.Account
import com.axis.task3.service.AccountService
import java.util.*

fun main(){
    var sc = Scanner(System.`in`)

    var accountService=AccountService()

    //------------create obj-----------------
    println("enter account number")
    var accNo:Int=sc.nextInt()
    println("enter balance")
    var balance:Double=sc.nextDouble()
    println("enter account type")
    var accType:String=sc.next()
    //------------------create obj-----------------

    //pass values to object
    var obj1= Account(accNo,balance,accType)

    //------------------display------------

    accountService.display(obj1)

    //------------------display------------

    //----------------withdraw----------------

    println("enter amount to withdraw")
    var withdrawAmount:Double=sc.nextDouble()
    accountService.withdraw(withdrawAmount,obj1)
    //----------------withdraw----------------

    //------------------deposit----------------

    println("enter amount to deposit")
    var depositAmount:Double=sc.nextDouble()

    accountService.deposit(depositAmount,obj1)
    //---------------deposit-----------------------


    //-------------------rate of interest---------------
    println("checking rate of interest according to account type")

    var bal:Double=accountService.rateOfInterest(obj1)
    println("Interest amount for this accountType is : $bal")
    //-------------------rate of interest---------------

    //--------------get balance with interest amount added

    accountService.getBalance(obj1)
    //--------------get balance with interest amount added







}