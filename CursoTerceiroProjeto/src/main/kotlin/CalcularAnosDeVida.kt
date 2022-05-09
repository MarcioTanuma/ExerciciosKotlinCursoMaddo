fun main() {
    var anoAtual = 2022
    var anoDeNascimento = 1971

    var calcularIdade = calcularIdade(anoAtual, anoDeNascimento)

    imprimirResultado(anoAtual, anoDeNascimento, calcularIdade)
}

fun calcularIdade(anoAtual: Int, anoDeNascimento: Int): Int {
    var idade = anoAtual - anoDeNascimento

    return idade

}

fun imprimirResultado(anoAtual: Int,anoDeNascimento: Int, calcularIdade: Int) {
    println("Ano de nascimento: $anoDeNascimento")
    println("Ano atual........: $anoAtual\n")
    println("Você tem ${calcularIdade(anoAtual, anoDeNascimento)} anos")

}

