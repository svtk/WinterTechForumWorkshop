package day1

fun isDigit(ch: Char) = ch in '0'..'9'

fun isNotDigit(ch: Char) =
    ch !in '0'..'9'

fun main() {
    println(isDigit('a'))    // false
    println(isDigit('5'))    // true
    println(isNotDigit('z')) // true
}