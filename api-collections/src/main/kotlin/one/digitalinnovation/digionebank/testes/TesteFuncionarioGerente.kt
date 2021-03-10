package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val maria = Gerente("Maria Pedro", "123.123.123-49", 3000.0, "senha125")

    ImprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().Autenticacao(maria)
}
