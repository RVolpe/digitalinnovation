package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {
    val joao = Analista("Joao Pedro", "123.123.123-49", 2000.0)

    ImprimeRelatorioFuncionario.imprime(joao)
}
