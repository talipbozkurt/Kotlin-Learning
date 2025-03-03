package org.example.basics.basictype


fun main() {
    val x: Int = 10 // primitive type | unboxed
    val x2: Int? = 10 // object representing a primitive type  | boxed

    // Array Types

    val studentNumbers = arrayOf(13, 45, 53, 54, 250)
    val studentNumbers2 = arrayOf<Int>(13, 45, 53, 54, 250)

    val studentNames = arrayOf("Ahmet", "Ayşe", "Aslı", "Veli")
    val mixedArray = arrayOf<Any>(13, "Ahmet", 'C', false) // array of Any includes boxed type


    // Add new element to Array
    val arrayOfNulls = arrayOfNulls<String>(4)
    println(arrayOfNulls.joinToString { "5" })
    val emptyArray0 = emptyArray<String>() // <> interface
    //emptyArray[5]= "New element" doesn't work

    var citiesArray = arrayOf("istanbul", "konya")
    //println(citiesArray)
    // citiesArray += "Sivas"
    var newCitiesArray = citiesArray + "Ankara"
    println(newCitiesArray.joinToString())

}