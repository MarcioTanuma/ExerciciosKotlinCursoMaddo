fun main(){

//    val caminhoPath = System.getProperty("user.dir")

    println("Seu diretório é ${getCaminhoAtual()}")
}

fun getCaminhoAtual():String {

    return System.getProperty("user.dir")
}