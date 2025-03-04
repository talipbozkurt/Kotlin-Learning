package org.example.basics.basictype

fun main() {
    var numberOne = 10
    var numberTwo = 5

    println(" NumberOne : ${numberOne}") //10
    println(" NumberOne : ${numberOne++}") //10
    println(" NumberOne : ${numberOne}")  //11
    println(" NumberOne : ${++numberOne}")  //12
    println(" NumberOne : ${numberOne}") //12

    // + == .plus

    println("${numberTwo + numberOne}")
    println(numberOne.plus(numberTwo))

    // - == .minus
    println("${numberTwo - numberOne}")
    println(numberTwo.minus(numberOne))

    // * == .times

    println("${numberTwo * numberOne}")
    println(numberTwo.times(numberOne))

    // / == .div
    println("${numberTwo / numberOne}")
    println(numberTwo.div(numberOne))

    // % == rem
    println("${numberTwo % numberOne}")
    println(numberTwo.rem(numberOne))

}