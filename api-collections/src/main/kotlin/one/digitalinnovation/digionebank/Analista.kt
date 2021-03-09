package one.digitalinnovation.digionebank

class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome= nome, cpf= cpf, salario= salario) {
    override fun calculoAuxilio(): Double = salario * 0.1
}