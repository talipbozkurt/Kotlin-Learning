package org.example.loop

fun main() {

    val value = 45
    for (value: Int in 1..10) {
        println("$value")
    }


    val countryCodeArray = arrayOf("tr", "az", "en", "fr")
    val alphabetList = arrayOf('A', 'B', 'C', 'D')

    for (value in 'A'..'Z') {
        println(value)
    }

    for (index in countryCodeArray.indices) {
        print("\n$index . value :  ${countryCodeArray[index]}")
    }

    // destructuring iteration

    for ((index, value) in countryCodeArray.withIndex()) {
        print("\n$index . value : $value")
    }



    // You can perform repetitive operations without needing any list by using repeat(size).

    repeat(8) { println("Mahmood Coffee") }
}