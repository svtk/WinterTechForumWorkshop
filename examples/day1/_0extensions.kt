package day1

fun String.singleQuote() = "'$this'"
fun String.doubleQuote() = "\"$this\""

fun main() {
    println("Hi".singleQuote()) // 'Hi'
    println("Hi".doubleQuote()) // "Hi"
}