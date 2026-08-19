package com.example.lib

fun main() {
    val data = "Hi! How are you"

    var vowelcount = 0
    var spacecount = 0

    for (ch in data) {
        /*when as statement
        when(ch) {
            'a', 'e', 'i', 'o', 'u' -> vowelcount++
            ' ' ->spacecount++
        }*/

        //when as a expression
        vowelcount += when(ch) {
            'a', 'e', 'i', 'o', 'u' ->{
                println("Vowel found: $ch")
                1
            }
            else -> 0
        }
        spacecount += when(ch) {
            ' ' ->1
            else -> 0
        }

    }
    println("")

}
