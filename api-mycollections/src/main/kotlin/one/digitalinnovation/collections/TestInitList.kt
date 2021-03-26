package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2300.0, "CLT")
    val rodrigo = Funcionario("Rodrigo", 2000.0, "PJ")
    val tiago = Funcionario("Tiago", 4000.0, "CLT")

    val funcionarios = listOf(joao, rodrigo, tiago)

    funcionarios.forEach{ println(it) }

    println("--------Teste Find-------------------")
    println(funcionarios.find {it.nome == "Tiago"})

    println("--------Teste sortedBy-------------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("---------Teste groupBy------------------")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }
}
