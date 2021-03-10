package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val jose = Cliente(
        nome = "Jose da Silva", cpf = "123.456.678-99", clienteTipo = ClienteTipo.PF, senha = "123432")

    println(jose.toString())

    TesteAutenticacao().Autenticacao(jose)
}
