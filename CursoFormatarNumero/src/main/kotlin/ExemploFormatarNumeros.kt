fun main(){

    val numero = 3
    val numeroFormatado = String.format("%05d",numero)
// dúvida: a variavél torna-se uma String?
    println("Numero sem formatação: $numero")
    println("Número formatado.....: $numeroFormatado")
}