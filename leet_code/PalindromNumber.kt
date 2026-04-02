package leet_code

fun main() {

}

fun isPalindrome(x: Int): Boolean {
    if (x < 0) {
        return false
    } else if (x < 10) {
        return true
    }

    var reverse = 0
    var y = x

    while (y > 0) {
        reverse = reverse * 10 + ( y % 10 )
        y /= 10
    }

    return x == reverse
}