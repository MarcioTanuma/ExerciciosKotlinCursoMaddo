fun main() {

    var valorA = 10
    var valorB = 20

    var i = 23

    if ((i == null) || (valorA < 8)) {
        processar()

    }
    if ((i != null) && (valorB > valorA)) {
        naoProcessar()
    }
    println("Fim")
}

    fun processar() {
        println("Primeiro IF é True")
    }

    fun naoProcessar() {
        println("Segundo IF é False")
    }
