package org.example.controlflow

 class PairNumber(val numberOne: Int, val numberTwo: Int) {

    operator fun minus(pairNumber: PairNumber): PairNumber {

        val localNumberOne = numberOne - pairNumber.numberOne
        val localNumberTwo = numberTwo - pairNumber.numberTwo

       val returnPairObject = PairNumber(localNumberOne , localNumberTwo)
        println("Result = (${returnPairObject.numberOne},${returnPairObject.numberTwo})")

        return returnPairObject
    }

}

fun main(args: Array<String>){
val a = 5
val b = 8

    var result = a+b
    result= a.plus(b)

    val pairNumberOne = PairNumber(2,4)
    val pairNumberTwo = PairNumber(-8,11)

    val resultOne = pairNumberOne.numberOne - pairNumberTwo.numberOne
    val resultTwo = pairNumberOne.numberTwo - pairNumberTwo.numberTwo
    println("Result = ($resultOne , $resultTwo)")

    val pairNumber = pairNumberOne - pairNumberTwo
    val pairNumber2 = pairNumberOne - pairNumberTwo




}