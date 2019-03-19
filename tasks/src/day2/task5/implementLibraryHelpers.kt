package day2.task5

/*
Implement all the helper functions `run`, `let`, `apply`, `also`.

| `receiver.<helper function> { ... }` | Take lambda with receiver:<br>`{ .. this .. }` | Take regular lambda:<br>`{ .. it .. }` |
|:------------------------------------:|:----------------------------------------------:|:--------------------------------------:|
|  Return result of the lambda         |  run                                           |  let                                   |
|  Return receiver                     |  apply                                         |  also                                  |

 */

fun <T, R> with(receiver: T, block: T.() -> R): R {
    TODO()
}

fun <T, R> T.run(block: T.() -> R): R {
    TODO()
}

fun <T, R> T.let(block: (T) -> R): R {
    TODO()
}

fun <T> T.apply(block: T.() -> Unit): T {
    TODO()
}

fun <T> T.also(block: (T) -> Unit): T {
    TODO()
}

fun main() {
    val sb = StringBuilder()
    with (sb) {
        append("0")
    }
    val s1 = sb.toString()
    println(s1) // 0

    val s2 = StringBuilder().run {
        append("1")
        toString()
    }
    println(s2) // 1

    val s3 = StringBuilder().let {
        it.append("2")
        it.toString()
    }
    println(s3) // 2

    val s4 = StringBuilder().apply {
        append("3")
    }.toString()
    println(s4) // 3

    val s5 = StringBuilder().also {
        it.append("4")
    }.toString()
    println(s5 ) // 4

    class Rectangle(var width: Int = 0, var height: Int = 0)
    val map = mapOf("square" to Rectangle())
    val square = map["square"]?.apply {
        width = 20
        height = 20
    }
    println(square?.width) // 20
    println(square?.height) // 20
}