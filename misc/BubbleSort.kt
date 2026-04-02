package misc

fun main() {
    val list = bubbleSort(listOf(987,77,37,73,7,347,37,6,632,46543,7,547,563,76,3734,643643,3,1,2))
    println(list)
}

fun <T: Comparable<T>> bubbleSort(list: List<T>, ascending: Boolean = true): List<T> {
    val result = list.toMutableList()

    for (i in list.size - 2 downTo  0) {
        for (j in 0..i) {
            if (result[j] > result[j+1]) {
                val temp = result[j]
                result[j] = result[j+1]
                result[j+1] = temp
            }
        }
    }

    return result
}
