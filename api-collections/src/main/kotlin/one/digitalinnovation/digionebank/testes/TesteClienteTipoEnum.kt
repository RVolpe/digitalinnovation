package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }
    // PF - Pessoa Física
    // PJ - Pessoa Jurídica

    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }
    // PF - Pessoa Física
    // PJ - Pessoa Jurídica

    val pf = ClienteTipo.PF
    val pj = ClienteTipo.PJ

    println("2a. parte")
    println("${pf.name} - ${pf.descricao}")
    println("${pj.name} - ${pj.descricao}")
}