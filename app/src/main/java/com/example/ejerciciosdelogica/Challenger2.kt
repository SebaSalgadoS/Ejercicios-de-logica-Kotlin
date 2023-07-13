package com.example.ejerciciosdelogica

/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

fun main(){
    println(esAnagrama("amor", "roma"))
}

private fun esAnagrama(palabra1: String, palabra2: String): Boolean{
    if (palabra1.lowercase() == palabra2.lowercase()){
        return false
    }
    return palabra1.lowercase().toCharArray().sortedArray().contentEquals(palabra2.lowercase().toCharArray().sortedArray())
}