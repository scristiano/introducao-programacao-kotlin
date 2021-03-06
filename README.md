# introducao-programacao-kotlin
Desafio Programação Kotlin

## Soma Simples

Leia dois valores inteiros identificados como variáveis A e B. Calcule a soma entre elas e chame essa variável de SOMA.
A seguir escreva o valor desta variável.

Entrada

O arquivo de entrada contém 2 valores inteiros.

Saída

Imprima a variável SOMA com todas as letras maiúsculas, inserindo um espaço em branco antes e depois do símbolo de igualdade, seguido pelo valor correspondente à soma de A e B.

``` kotlin
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
```
### Compilando e executando o algorítimo

Comando para compilação

```sh
kotlinc somaSimples.kt -include-runtime -d somaSimples.jar
```

Comando para execução

```sh
java -jar somaSimples.jar
```

## Números Ímpares

Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.

Entrada

O arquivo de entrada contém 1 valor inteiro qualquer.

Saída

Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.

``` kotlin
import java.util.Scanner

fun main(args: Array<String>) {
    val userInput = Scanner(System.`in`)  
    var num:Int = userInput.nextInt()  
    for (i in 1..num)
    if(i%2!=0)print("$i "+"\n")
}
```
### Compilando e executando o algorítimo

Comando para compilação

```sh
kotlinc numerosImpares.kt -include-runtime -d numerosImpares.jar
```

Comando para execução

```sh
java -jar numerosImpares.jar
```

## Quadrado e Ao Cubo

Você terá o desafio de escrever um programa que leia um valor inteiro N (1 < N < 1000). Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.

Entrada

O arquivo de entrada contém um número inteiro positivo N.

Saída

Imprima a saída conforme o exemplo fornecido.

``` kotlin
fun main(args: Array<String>) {    
    for (i in 1..readLine()!!.toInt()) {
        println("$i ${ i * i  } ${ i * i * i }")         
    }
}
```
### Compilando e executando o algorítimo

Comando para compilação

```sh
kotlinc quadradoAoCubo.kt -include-runtime -d quadradoAoCubo.jar
```

Comando para execução

```sh
java -jar quadradoAoCubo.jar
```

**Demais Referências:**

[Página Oficial Kotlin](https://kotlinlang.org/)

[Página Oficial SDKMAN](https://sdkman.io/)

[Tutorial Instalação SDKMAN](https://www.youtube.com/watch?v=7oh5e1wx5J0)
