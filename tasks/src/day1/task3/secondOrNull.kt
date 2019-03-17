package day1.task3

/*
Implement `secondOrNull` and `penultimateOrNull` extensions on a `List`
returning a second and second last elements accordingly or  `null`
if the list contains less than two elements.
Implement `secondOrNull` as an extension function
and `penultimateOrNull` as an extension property.
 */
fun <T> List<T>.secondOrNull(): T? =
    TODO()

val <T> List<T>.penultimateOrNull: T?
    get() = TODO()

fun main() {
    val strings = listOf("a", "b", "c", "d")
    strings.secondOrNull()    // b
    strings.penultimateOrNull // c
}