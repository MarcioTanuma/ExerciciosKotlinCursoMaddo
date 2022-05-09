fun main(args:Array<String>){

    var numeroBinario:Long = 11111110
    var numeroDecimal:Int = 0

    println("Método Principal")

    numeroDecimal = conversorBinarioDecimal(numeroBinario)

    println("O numero binário: $numeroBinario convertido para Número Decimal é $numeroDecimal.")
   //  println("Número Convertido: $numeroDecimal")
}

fun conversorBinarioDecimal(numeroBinario:Long): Int {

    var numeroBinario = numeroBinario
    var numeroDecimal = 0
    var contador = 0
    var numeroTemporario:Long

    while (numeroBinario.toInt() !=0){

        numeroTemporario = numeroBinario % 10
        numeroBinario /= 10
        numeroDecimal += (numeroTemporario * Math.pow(2.0,contador.toDouble())).toInt()
        ++contador
    }

    // println("Método de Conversão $numeroBinario")

    return numeroDecimal
}