package com.axis.task3.service

import com.axis.task3.model.Account

class AccountService {
    fun display(account:Account){
        println(account.toString())

    }

    fun withdraw(amount:Double,account:Account){
        if (amount>account.balance) {
            println("withdraw amount limit exceeded ")
            println("current balance is ${account.balance}")
        }
        else{
            println("amount withdraw success")
            account.balance-=amount
            println("remaining balance after withdraw: ${account.balance}")
        }

    }

    fun deposit(amount:Double,account:Account){
        account.balance+=amount
        println("deposit successful")
        println("account balance after deposit: ${account.balance}")
    }

    fun rateOfInterest(account: Account):Double {
        var type: String = account.accType

        if (type == "savings") {
            println("savings account")

            var interestAmount = account.balance * 0.06
            return interestAmount

        }
        println("current account")
        var interestAmount=account.balance*0.10
        return interestAmount
    }

    fun getBalance(account: Account){
        var totalBalanceWithInterest= rateOfInterest(account)+account.balance
        println("total balance after adding interest : $totalBalanceWithInterest")
    }




}