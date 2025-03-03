package org.example.basics.basictype


fun main() {
    val x: Int = 10 // primitive type | unboxed
    val x2: Int = 10 // object representing a primitive type  | boxed

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

    // Link between Array and String
    val firstCharacterOfCountries = CharArray(4)
    firstCharacterOfCountries[0] = 't'
    firstCharacterOfCountries.set(1, 'a')
    val firstcc = "ta"
    println(firstcc[0])
   // Multi dimension Arrays

    val twoDArray = Array(2) { Array<Int>(2) { 0 } }
    println(twoDArray.contentDeepToString())
    // [0 , 0] , [0 , 0]

    val threeDArray = Array(3) { Array(3) { Array(3) { 0 } } }
    println(threeDArray.contentDeepToString())

    // [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
    // [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
    // [[0, 0, 0], [0, 0, 0], [0, 0, 0]]

    val simpleArray = arrayOf(1, 2, 3)
    //accesses to element and modified it
    simpleArray[0] = 10
    twoDArray[0][0] = 20


    println(simpleArray[0].toString()) //10
    println(twoDArray[0][0].toString()) //20
}