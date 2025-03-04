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

    print("Enter final grade")
    val grade = readln().toInt()

    val charNote = if (grade == 100) {
        "$grade = AA"
    } else if (grade <= 99 && grade >= 80) {
        "$grade == BB"
    } else if (grade <= 79 && grade >= 50) {
        "$grade == CC"
    } else if (grade <= 49 && grade >= 20) {
        "$grade == DD"
    } else if (grade <= 19 && grade >= 0) {
        "$grade == FF"
    } else {
        "$grade = Bulunamadı !!"
    }
    println(charNote)



}