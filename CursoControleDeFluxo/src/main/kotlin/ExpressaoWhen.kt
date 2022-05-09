fun main(){

    println("Digite um valor inteiro para comparação:")
    var valor:Int = readLine()!!.toInt()

    when (valor){
        10 -> println("O valor comparado é igual a 10")
        20 -> println("O valor comparado é igual a 20")
        30 -> println("O valor comparado é igual a 30")
        40 -> println("O valor comparado é igual a 40")
        else -> println("O valor comparado não é 10, 20, 30 ou 40")
    }
}