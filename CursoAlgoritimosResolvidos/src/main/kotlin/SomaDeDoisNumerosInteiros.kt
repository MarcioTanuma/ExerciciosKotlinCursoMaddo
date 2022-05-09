fun main() {

    val primeiroNumero = 10
    val segundoNumero: Int = 10

    var soma = somarDoisNumeros(primeiroNumero, segundoNumero)

    imprimirSoma(primeiroNumero, segundoNumero, soma)

    imprimirSoma(25,30, somarDoisNumeros(25,30))
}
    private fun imprimirSoma(primeiroNumero:Int, segundoNumero:Int, soma:Int) {
    println("Primeiro Número: $primeiroNumero")
    println("Segundo Número : $segundoNumero")
    println("Soma           : $soma")
}

fun somarDoisNumeros(primeiroNumero:Int, segundoNumero:Int): Int{

    return primeiroNumero + segundoNumero

}