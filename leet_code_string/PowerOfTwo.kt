package leet_code_string

fun main() {
    println(isPowerOfTwo(0))
    println(isPowerOfTwo(1))
    println(isPowerOfTwo(5))
    println(isPowerOfTwo(8))
}

fun isPowerOfTwo(n : Int): Boolean {
    return n > 0 && (n and (n-1) == 0)
}