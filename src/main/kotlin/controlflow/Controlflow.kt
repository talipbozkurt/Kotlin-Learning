package org.example.controlflow

fun main() {

    print("Are you student ? ")
    val answer = readln()

    // state usage

    if (answer.contains("Yes", ignoreCase = true)) {
        println("student")
    } else {
        println("not a student")
    }

    // expression usage

    val result: String = if (answer == "Yes") {
        "student"
    } else {
        "not a student"
    }

    println(result)

    // When numbers are compared with if, their types must be the same.
    if (10 == 10L.toInt()) {
        println("true")
    }
}




