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


    val a = 12
    val b = 18
    val c = 12
    println(a.compareTo(b))  // -1
    println(b.compareTo(a))  // 1
    println(a.compareTo(c))  // 0

    val numb1: Int = 5
    val numb2: Int = 2

    //println(numb1+numb2) // + operator is not used with nullable variable
    println(numb1.plus(numb2)) // correct way to use the .plus func. with nullable variable

    // The way to use nullable variables with the + operator

    if (numb1 == null) {
        return
    }
    if (numb2 == null) {
        return
    }

    println("Sum = ${numb1 + numb2}")

    var numbOne = 10
    var numbTwo = 5
    var flag = true

    println("+a : " + +numbOne) //  +a :10
    println("-b : " + -numbTwo) // -b : -5
    println("++a : " + +numbOne) // ++a : 10
    println("a++ : " + ++numbOne) // a++ : 11
    println("a : " + numbOne) // a : 11
    println("--b : " + --numbTwo) // --b : 4
    println("!flag : " + !flag) // !flag : false
    println("!falg : " + flag.not()) // !flag : false

    /*
  +a   a.unaryplus()
  -a   a.unaryMinus()
 ++a   a.inc()  a = a+1
 --a   a.dec()  a = a-1
  !a   a.not()
     */


}