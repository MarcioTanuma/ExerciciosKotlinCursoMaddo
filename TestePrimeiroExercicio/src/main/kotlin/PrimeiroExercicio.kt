fun main() {
    println("Qual o seu nome: ")

    var nome: String = readLine()!!.toString()

    println("Olá $nome, muito prazer!\n")

    println("Informe sua idade: ")

    var idade: Int = readLine()!!.toInt()

    print("Sua idade é $idade anos.\n")
}