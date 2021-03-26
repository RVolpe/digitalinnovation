package one.digitalinnovation.collections

fun main() {
    val salarios = DoubleArray(size = 3)
    salarios[0] = 1000.0
    salarios[1] = 2000.0
    salarios[2] = 500.0

    salarios.forEach { println(it) }

    println("----------------------------")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.10
    }
    salarios.forEach { println(it) }

    val salarios2 = doubleArrayOf(3400.0, 2200.0, 1300.0)

    salarios2.sort()
    println("----------------------------")
    salarios2.forEach { println(it) }

}
