fun main() {

    println("Informe a base do triângulo: ")
    var base: Double = readLine()!!.toDouble()
    println("Informe a altura do triângulo: ")
    var altura: Double = readLine()!!.toDouble()

    var area = calcularAreaDoTriangulo(base, altura)

    println("A área do triângulo é: $area")
}

fun calcularAreaDoTriangulo(base: Double, altura: Double): Double {

    return (base * altura) / 2

}