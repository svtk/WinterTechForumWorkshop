package day1

fun sample1() {
    class TwoNumbers(val first: Int, val second: Int)

    val p1 = TwoNumbers(1, 3)
    val p2 = TwoNumbers(1, 3)
    println(p1 == p2)
}

fun sample2() {
    data class TwoNumbers(val first: Int, val second: Int)

    val p1 = TwoNumbers(1, 3)
    val p2 = TwoNumbers(1, 3)
    println(p1 == p2)
}

fun main() {
    sample1()
    sample2()
}