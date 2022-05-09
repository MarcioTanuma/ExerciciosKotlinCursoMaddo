fun main(){

    var campoA = "Brasília"
    var campoB = "São Paulo"
    var campoC = "Brasília"

    var comparacao1 = (campoA.equals(campoB) && campoA.equals(campoC))
    var comparacao2 = (campoA.equals(campoB) || campoA.equals(campoC))
    var comparacao3 = (campoA.equals(campoB) != campoB.equals(campoC))

    println("Resultado da Comparação 1: $comparacao1")
    println("Resultado da Comparação 2: $comparacao2")
    println("Resultado da Comparação 3: $comparacao3")
}