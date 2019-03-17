package day1.task2

/*
Implement an extension function isNullOrEmpty on the type String?.
It should return true, if the string is empty or null.

Note that the Kotlin standard library contains the same function.
*/

fun String?.isNullOrEmpty(): Boolean =
    TODO()

fun main() {
    val s1: String? = null
    val s2: String? = ""
    println(s1.isNullOrEmpty() && s2.isNullOrEmpty()) // true
}