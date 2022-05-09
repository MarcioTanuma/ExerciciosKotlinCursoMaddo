fun main(){

    val peso1:Int = 2
    val peso2:Int = 3
    val peso3:Int = 4

    println("Digite a 1ª nota:")
    var nota1:Double = readLine()!!.toDouble()
    println("Digite a 2ª nota:")
    var nota2:Double = readLine()!!.toDouble()
    println("Digite a 3ª nota:")
    var nota3:Double = readLine()!!.toDouble()

    var mediaPonderada = calcularMediaPOnderada(peso1, peso2, peso3, nota1, nota2, nota3)

    mostrarResultado(mediaPonderada)

}

fun calcularMediaPOnderada( peso1:Int,
                            peso2:Int,
                            peso3:Int,
                            nota1:Double,
                            nota2:Double,
                            nota3:Double):Double {
    var mediaPonderada = ((nota1*peso1) + (nota2*peso2) + (nota3*peso3)) / (peso1 + peso2 + peso3)

    return mediaPonderada
}
fun mostrarResultado(mediaPonderada:Double){

    return  println("A Média Ponderada é: $mediaPonderada")

}

