package one.digitalinnovation.digionebank

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
) : Pessoa(nome, cpf) {
    protected abstract fun calculoAuxilio() : Double
    //somente esta classe e suas filhas podem usar

    override fun toString(): String {
        return "Nome: $nome - CPF: $cpf, salário: $salario, auxílio: ${calculoAuxilio()}"
    }
}