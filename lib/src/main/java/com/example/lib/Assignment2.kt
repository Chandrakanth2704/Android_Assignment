package com.example.lib

fun convert(names : Array<String?>) {
    //TODO
    //1. Convert the name in array into uppercase using explicit null check
    /*for (name in names)
        if(name != null)
            println(name.uppercase())*/

    //2. safe call operator
    /*for (name in names)
        println(name?.uppercase())
     */

    //3. Elvis operator, assertion operator
    /*for (name in names)
        println(name?.uppercase()?: "unknown")
    */

    //Assertion operator
    for (name in names)
        if (name!= null)
        println(name !!.uppercase())

}

fun main() {
    convert(names = arrayOf("john", null, "merry", "robert","gowtham"))

}