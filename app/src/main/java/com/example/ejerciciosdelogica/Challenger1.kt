package com.example.ejerciciosdelogica

/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

fun main() {

    for(index in 1..100){
        val divisibleByThree = index % 3 == 0
        val divisibleByFive = index % 5 == 0
        if (divisibleByFive && divisibleByThree){
            println("fizzbuzz")
        }else if (divisibleByThree){
            println("fizz")
        }else if (divisibleByFive){
            println("buzz")
        }else{
            println(index)
        }

    }
}

