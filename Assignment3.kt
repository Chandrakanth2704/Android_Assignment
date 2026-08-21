package com.example.lib

    //Functional Programming, collections
fun main() {
    val phoneNumbers = listOf<String>("1234567890","123","","9897888542")

    // 1. using lambda, filter valid Phone Numbers - 10 Digits
        //filter()

    val validNumber = phoneNumbers.filter {it.length == 10}
    println("The valid Phone Numbers are $validNumber\n")

    // 2. using lambda, print all phone numbers, if invalid - print 'NAN'
    // forEach(), map()
    phoneNumbers
    .map { if (it.length == 10) it else "NAN" }
    .forEach { println(it) }
}
