package org.example.basics.basictype


fun main() {
    val x: Int = 10 // primitive type | unboxed
    val x2: Int? = 10 // object representing a primitive type  | boxed

    // Array Types

    val studentNumbers = arrayOf(13, 45, 53, 54, 250)
    val studentNumbers2 = arrayOf<Int>(13, 45, 53, 54, 250)

    val studentNames = arrayOf("Ahmet", "Ayşe", "Aslı", "Veli")
    val mixedArray = arrayOf<Any>(13, "Ahmet", 'C', false) // array of Any includes boxed type
}