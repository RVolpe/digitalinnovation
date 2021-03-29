package one.digitalinnovation.collections

fun main() {
    val par: Pair<String, Double> = Pair("Tiago", 3000.0)
    val map1 = mapOf(par)

    map1.forEach { (k,v) -> println("Chave: $k - Valor: $v") }

    val map2 = mapOf(
        "Pedro" to 1500.00,
        "Rodrigo" to 4350.0
    )

    println("--------------------------------")
    map2.forEach { (k,v) -> println("Chave: $k - Valor: $v") }
}