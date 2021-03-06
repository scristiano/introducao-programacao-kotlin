import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    println("Digite um número: ")    
    val a = input.nextInt()
    println("Digite outro número: ")
    val b = input.nextInt()
    val soma: Int
    soma = a + b
    println("SOMA = " + ( soma ))  //insira as variáveis corretamente
}