package day1

import day1.Direction.*

enum class Direction(val notation: String) {
    NORTH("N"), SOUTH("S"),
    EAST("E"), WEST("W");
    val opposite: Direction
        get() = when (this) {
            NORTH -> SOUTH
            SOUTH -> NORTH
            WEST -> EAST
            EAST -> WEST
        }
}

fun main() {
    println(NORTH.notation) // N
    println(NORTH.opposite) // SOUTH
    println(NORTH.opposite.notation) // S
}