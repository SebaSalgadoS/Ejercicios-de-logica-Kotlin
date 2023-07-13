package com.example.ejerciciosdelogica


/*
    Dado un array de numeros enteros, devuelve la suma mas grande entre dos numeros adyacentes
 */
fun main() {
    val arrayNumbers = arrayOf<Int>( 2, 4, 1, 5, 6, 3)

    maxAdjacentSumWithIf(arrayNumbers)
    println("el resultado usando If es  : " + maxAdjacentSumWithIf(arrayNumbers).toString())
    maxAdjacentSum(arrayNumbers)
    println("El resultado sin usar If es : " + maxAdjacentSum(arrayNumbers).toString())

}

//Usando If
fun maxAdjacentSumWithIf(array: Array<Int>): Int {
    var maxSum = Int.MIN_VALUE
    val result = ""
    for (list in 0 until array.size - 1) {
        val actualSum = array[list] + array[list + 1]
        if (actualSum > maxSum) {
            maxSum = actualSum
        }
    }
    return maxSum

}

// Sin usar If
fun maxAdjacentSum(array: Array<Int>): Int {
    var maxSum = Int.MIN_VALUE
    for (list in 0 until array.size - 1) {
        val actualSUm = array[list] + array[list + 1]
        maxSum= Math.max(maxSum, actualSUm)
    }
    return maxSum
}