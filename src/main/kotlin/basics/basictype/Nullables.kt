package org.example.basics.basictype

fun main(){
    var number : Int? = null // number can be null


   // println(number+5) doesen't work , number null
    println(number?.plus(5))
    println(number ?: 0 + 5) // elvis operator usage


    //var x : Nothing = null   error
    var x : Nothing? = null

}
