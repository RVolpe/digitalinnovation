package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Rodrigo"
    var cpf: String = "123.123.123-49"
}

fun main() {
    val rodrigo = Pessoa()

    println( "Nome: "+ rodrigo.nome + " - CPF: " + rodrigo.cpf)
}