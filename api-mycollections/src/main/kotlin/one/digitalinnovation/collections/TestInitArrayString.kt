package one.digitalinnovation.collections

fun main() {
    val nomes = Array(size = 3) {""}

    nomes[0] = "Maria"
    nomes[1] = "Tiago"
    nomes[2] = "Rodrigo"

    nomes.sort()
    for (nome in nomes) {
        println(nome)
    }

    println("Nova impressão")
    nomes.forEach {
        println(it)
    }

    val nomes2 = arrayOf("Maria2", "Tiago2", "Rodrigo2")

    nomes2.sort()
    for (nome in nomes2) {
        println(nome)
    }
}