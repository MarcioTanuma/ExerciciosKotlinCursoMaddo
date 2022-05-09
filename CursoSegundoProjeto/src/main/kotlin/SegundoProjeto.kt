fun main() {

    var variavelA = "Márcio"
    var variavelB = "Tanuma"
// função \n = muda de linha
    println("Meu nome é:\nMarcio Tanuma")
// função \t = quatro espaços
    println("Marcio\t\tTanuma")
    println("Meu nome é: $variavelA $variavelB")

    //criando um método imprimir
    imprimir(variavelA, variavelB)
    imprimir(variavelB, variavelA)
    imprimir(variavelA, variavelA)
    imprimir(variavelB, variavelB)
}
fun imprimir(variavelA:String, variavelB:String){

    println("$variavelA $variavelB")

}