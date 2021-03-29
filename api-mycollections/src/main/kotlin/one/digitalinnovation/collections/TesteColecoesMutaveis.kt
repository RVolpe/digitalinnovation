package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2300.0, "CLT")
    val rodrigo = Funcionario("Rodrigo", 2000.0, "PJ")
    val tiago = Funcionario("Tiago", 4000.0, "CLT")

    println("---------List---------------")
    val funcionarios = mutableListOf(joao, rodrigo)
    funcionarios.forEach{ println(it)}

    println("------------------------")
    funcionarios.add(tiago)
    funcionarios.forEach{ println(it)}

    println("------------------------")
    funcionarios.remove(joao)
    funcionarios.forEach{ println(it)}

    println("---------Set---------------")
    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach{ println(it)}

    println("------------------------")
    funcionariosSet.add(tiago)
    funcionariosSet.add(rodrigo)
    funcionariosSet.forEach{ println(it)}

    println("------------------------")
    funcionariosSet.remove(joao)
    funcionariosSet.forEach{ println(it)}
}
