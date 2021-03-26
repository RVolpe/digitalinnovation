package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2300.0, "CLT")
    val rodrigo = Funcionario("Rodrigo", 2000.0, "PJ")
    val tiago = Funcionario("Tiago", 4000.0, "CLT")

    val funcionarios1 = setOf(joao, rodrigo)
    val funcionarios2 = setOf(tiago)
    val funcionarios3 = setOf(joao, rodrigo, tiago)

    val uniaoFunc = funcionarios1.union(funcionarios2)
    uniaoFunc.forEach {println(it)}

    println("----------Substract-------------------------")
    val uniaoFunc2 = funcionarios3.subtract(funcionarios2)
    uniaoFunc2.forEach {println(it)}

    println("----------Intersect-------------------------")
    val uniaoFunc3 = funcionarios3.intersect(funcionarios2)
    uniaoFunc3.forEach {println(it)}
}