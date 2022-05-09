fun main(){

    val cidade = "são Paulo"

    println("Cidade: $cidade")
    println("Total de Caracteres: ${cidade.length}")
    println("Transforma a primeira letra em Maiúscula: ${cidade.capitalize()}")
    println("Transforma a primeira letra em minúscula: ${cidade.lowercase()}")
    println("Transforma todas as letra em MAIÚSCULA: ${cidade.uppercase()}")
    println("Verifica se o campo é vazio: ${cidade.isEmpty()}")
    println("Verifica se o campo é Branco: ${cidade.isBlank()}")
    println("Imprime o último caracter: ${cidade.last()}")
    println("Imprime a Stringsão Paulo Reversa: ${cidade.reversed()}")
    println("Imprime a Stringsão Paulo Reversa e letras MAIÚSCULAS: ${cidade.reversed().uppercase()}")
}