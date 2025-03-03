package org.example.basics.basictype

fun main() {
    val charNumber = '6'

    // Getting the ASCII (Unicode) value of the character
    val convertedCharNumber = charNumber.code

    // Converting the character to an integer (digit)
    val digitToInt = charNumber.digitToInt()

    println("charNumber = $charNumber") // Output: 6
    println("convertedCharNumber (ASCII Code) = $convertedCharNumber") // Output: 54
    println("digitToInt = $digitToInt") // Output: 6

    // Example of a deprecated function (toInt() should not be used)
    // val convertedCharNumber = charNumber.toInt()
}
