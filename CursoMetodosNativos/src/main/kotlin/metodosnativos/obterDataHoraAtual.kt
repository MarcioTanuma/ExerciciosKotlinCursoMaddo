import java.time.LocalDateTime

fun main(){

    val dataHoraAtual = getDataHoraAtual()

    println("A data e hora atual: $dataHoraAtual")
}

fun getDataHoraAtual():LocalDateTime{

    return LocalDateTime.now()
}