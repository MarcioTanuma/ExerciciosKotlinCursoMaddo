package aulasarray

fun main(){

    val arrayElementos = Array<String>(size = 13,
        init = {index -> "uva($index)"})

/*    println("Tamanho do Array: ${arrayElementos.size}")
    println("Posição do Array 0: ${arrayElementos.get(0)}")
    println("Posição do Array 1: ${arrayElementos.get(1)}")
    println("Posição do Array 2: ${arrayElementos.get(2)}")
    println("Posição do Array 3: ${arrayElementos.get(3)}") */

    arrayElementos.set(11, "laranja")

//    println("Posição do Array 1: ${arrayElementos.get(1)}")

    for (posicao in arrayElementos)

    println("Elemento da posição: ${posicao}")
}