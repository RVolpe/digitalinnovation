package one.digitalinnovation.collections

fun main() {
    val values = IntArray(size = 5)
    values[0] = 1
    values[1] = 5
    values[2] = 3
    values[3] = 8
    values[4] = 10

    for (i in values) {
        println(i)
    }
    println("Nova impressão")
    values.forEach { println(it) }

    println("Nova impressão 2")
    for (indice in values.indices) {
        println(values[indice])
    }

    values.sort()
    println("Impressão sorteada")
    for (indice in values.indices) {
        println(values[indice])
    }
}