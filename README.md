# introducao-programacao-kotlin
Desafio Programação Kotlin

## Soma Simples

Leia dois valores inteiros identificados como variáveis A e B. Calcule a soma entre elas e chame essa variável de SOMA.
A seguir escreva o valor desta variável.

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

**Demais Referências:**

[Página Oficial Kotlin](https://kotlinlang.org/)

[Página Oficial SDKMAN](https://sdkman.io/)

[Tutorial Instalação SDKMAN](https://www.youtube.com/watch?v=7oh5e1wx5J0)
