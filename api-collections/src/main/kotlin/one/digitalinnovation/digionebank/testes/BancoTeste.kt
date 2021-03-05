package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main() {
    val digiOneBank = Banco(nome= "Digital", numero= 133)

    println(digiOneBank.nome)
    println(digiOneBank.numero)
}