package one.digitalinnovation.collections

import kotlin.math.max

fun main() {
    val salarios = doubleArrayOf(3400.0, 2200.0, 1300.0)

    for (salario in salarios) {
        println(salario)
    }

    println("--------------------")
    println("Maior salário: ${salarios.maxOrNull()} ")
    println("Menor Salário: ${salarios.minOrNull()}")
    println("Média Salarial: ${salarios.average()}")

    val salariosMaior2000 = salarios.filter { it > 2000.0 }

    println("------Teste de Filter ------------")
    for (salario in salariosMaior2000) {
        println(salario)
    }

    println("------Teste de Count -------------")
    println(salarios.count { it in (2000.0 .. 5000.0) })

    println("------Teste de Find -------------")
    println(salarios.find { it == 3400.0 })

    println("------Teste de Any -------------")
    println(salarios.any { it == 2200.0 })
}