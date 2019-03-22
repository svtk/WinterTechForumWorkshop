package day4.task1

/*
In the following examples the helper functions are used not in the most
efficient way. In each case choose another helper function which better
suits the context.

There are no tests for this task, just compare your version with the
solution when you complete it.
*/

class X {
    var first = 0
    var second = 0
    var third = 0
}

fun example1(x: X) {
    x.let {
        it.first = 1
        it.second = 2
        it.third = 3
    }
}

class Y {
    fun start() {}
    fun finish() {}
}

fun example2(y: Y?) {
    y?.let {
        with(it) {
            start()
            finish()
        }
    }
}

class Z {
    fun init() {}
}

fun example3(z: Z) {
    val result = with(z) {
        init()
        this
    }
}

fun main() {
    example1(X())
    example2(Y())
    example3(Z())
}