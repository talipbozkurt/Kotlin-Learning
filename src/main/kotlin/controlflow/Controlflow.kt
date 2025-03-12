package org.example.controlflow

import java.util.*

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

    // nullable and normal variable usage for if statment

    val nullableVariable: Boolean = true
    val variable = false

    if (variable) {
        println("variable true")
    } else {
        println("variable false")
    }

    if (nullableVariable == true) {
        println("nullableVariable true")
    } else {
        println("nullableVariable false")
    }

    // when usage

    val countryCode = readln()
    when (countryCode.lowercase(Locale.getDefault())) {
        "tr", "az" -> println("Turk citizen")
        "ar" -> println("Arab citizen")
        "fr" -> println("France citizen")
        "ru" -> println("Russian citizen")
        "uk" -> println("United Kingdom citizen")
    }

    // is usage with when
    val phonenumber: Long = 161616161616
    when (phonenumber) {
        is Long -> {
            println("Long value")
        }

        !is Long -> {
            println("Not a long value")
        }
    }
   // in usage with when

    val number = readln().toInt()
    when (number) {
        in 0..9 -> println("number is range of the number")
    }
}




