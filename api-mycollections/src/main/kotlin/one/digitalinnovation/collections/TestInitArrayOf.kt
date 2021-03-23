package one.digitalinnovation.collections

fun main() {
    val values = intArrayOf(1, 2, 7, 10, 9, 4)

    values.sort()
    values.forEach {
        println(it)
    }
}