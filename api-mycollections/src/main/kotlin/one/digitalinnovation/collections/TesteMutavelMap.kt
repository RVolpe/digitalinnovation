package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2300.0, "CLT")
    val rodrigo = Funcionario("Rodrigo", 2000.0, "PJ")
    val tiago = Funcionario("Tiago", 4000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.created(joao.nome, joao)
    repositorio.created(rodrigo.nome, rodrigo)
    repositorio.created(tiago.nome, tiago)

    println(repositorio.findById(joao.nome))
}