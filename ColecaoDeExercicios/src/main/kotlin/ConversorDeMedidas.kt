fun main(){

    println("*** Conversor de Medidas ***\n")
    println("Informe a quantidade de Pés:")
    var pes:Int = readLine()!!.toInt()
    println("")
    println("Conversão de Pés em Polegadas:")
    var polegadas = converterPesEmPolegadas(pes)
    println("$pes Pés equivalem a $polegadas Polegadas")
    println("")
    println("Conversão de Pés em Jardas:")
    var jardas = converterPesEmJardas(pes)
    println("$pes Pés equivalem a $jardas Jardas")
    println("")
    println("Conversão de Pés em Jardas:")
    var milhas = converterJardasEmMilhas(jardas)
    println("$jardas Jardas equivalem a $milhas Milhas")
}

fun converterPesEmPolegadas(pes:Int):Int{
    return pes * 12
}
fun converterPesEmJardas(pes:Int):Double{
    return pes / 3.0
}
fun converterJardasEmMilhas(jardas:Double):Double{
    return jardas / 1760.0

}