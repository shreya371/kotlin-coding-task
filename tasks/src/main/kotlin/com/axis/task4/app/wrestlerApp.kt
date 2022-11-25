package com.axis.task4.app

import com.axis.task4.model.Wrestler
import com.axis.task4.service.WrestlerService
import java.util.*
fun main(){
    var sc = Scanner(System.`in`)
    var wrestlerService=WrestlerService()
    /*
    //add data
    println("enter wrestler name")
    var name=sc.next()
    println("enter wrestler age")
    var age =sc.nextInt()
    println("enter wrestler height")
    var height=sc.nextInt()
    println("enter wrestler weight")
    var weight=sc.nextInt()

    //passing values to object
    var wrestler=Wrestler(name,age,height,weight)

    //adding to mutable list
    wrestlerService.addWrestler(wrestler)

    //display all
    wrestlerService.displayAllWrestlers()

    //count of wrestlers whose age is  > 35
    wrestlerService.countOfWrestlers()
    */


   println("-----------MENU--------------------")
    println("1.Add Wrestler \n2.Display All Wrestlers\n3.count of wrestlers whose age is > 35\n4.count of wrestlers whose weight is >200\n5)exit")

    println("enter choice")
    var choice=sc.nextInt()
    while (choice <5) {
        when (choice) {
            1->{
                println("enter wrestler name")
                var name=sc.next()
                println("enter wrestler age")
                var age =sc.nextInt()
                println("enter wrestler height")
                var height=sc.nextInt()
                println("enter wrestler weight")
                var weight=sc.nextInt()

                //passing values to object
                var wrestler=Wrestler(name,age,height,weight)

                //adding to mutable list
                wrestlerService.addWrestler(wrestler)

        }

            2->{
                wrestlerService.displayAllWrestlers()
            }
            3->{
                wrestlerService.countOfWrestlers()
            }
            4->{
                wrestlerService.countOfWeight()

            }
            5->{
                println("Program end")
                System.exit(0)
            }


    }
        println("------------Process completed-------------")
        println("1.Add Wrestler \n2.Display All Wrestlers\n3.count of wrestlers whose age is > 35\n4.count of wrestlers whose weight is >200\n5)exit")

        println("enter choice to continue")
        var ch =sc.nextInt()
        choice = ch
}


}
