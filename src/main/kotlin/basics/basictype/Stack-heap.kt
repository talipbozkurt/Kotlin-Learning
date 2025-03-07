package org.example.basics.basictype

fun main() {

   /* "The `Int` variable type is stored on the stack and is static. "
    It points to the value of the variable.
    Arrays, on the other hand, are stored on the heap and point to the reference of the variable."*/


    var sayi1 = 10
    var sayi2: Int
    sayi2 = sayi1
    sayi1 = 20
    println(" sayi1 = ${sayi1}  sayi2 = ${sayi2}") // sayi1 = 20 sayi2 = 10


    var nullableSayi1: Array<Int?> = arrayOf(10)
    var nullableSayi2: Array<Int?> = nullableSayi1

    nullableSayi1[0] = 20

    println("nullableSayi1 = ${nullableSayi1[0]}  nullableSayi2 = ${nullableSayi2[0]}") //nullableSayi1 = 20  nullableSayi2 = 20

    val nullableType : Boolean? = true

    //if(nullableType){} type mismatch
    if(nullableType==true){}
}