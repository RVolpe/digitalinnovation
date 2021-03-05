package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Rodrigo"

    var cpf: String = "123.123.123-49"
    private set    //cpf não pode ser alterado externamente, somente lido (get)

    constructor()

    fun pessoaInfo() = "Nome: $nome - CPF: $cpf"
}

fun main() {
    val rodrigo = Pessoa()

    println(rodrigo.pessoaInfo())
}