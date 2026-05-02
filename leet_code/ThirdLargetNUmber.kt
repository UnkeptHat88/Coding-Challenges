package leet_code

import java.util.PriorityQueue

fun main() {
    val arr = arrayOf(6,456,5426,435,654,624,523,523,564,376,67,356,3,76524,623,42,5642,562,4652,7,7,7,7,7,7,1,1,1,1,1,99999,99999,99999,99999)
    println(findThirdLargestNumber1(arr))
    arr.sort()
    println()
    for (i in arr) {
        print("$i-")
    }
}

fun findThirdLargestNumber(arr: Array<Int>): Int {
    if (arr.size < 3) {
        return 0
    }

    var max = 0
    var smax = 0
    var tmax = 0

    for (i in arr) {
        if (i > max) {
            tmax = smax
            smax = max
            max = i
        } else if (i > smax && i != max) {
            tmax = smax
            smax = i
        } else if (i > tmax && i != smax && i != max) {
            tmax = i
        }
    }

    return tmax
}

fun findThirdLargestNumber1(arr: Array<Int>): Int {
    val pq = PriorityQueue<Int>(4)

    arr.forEach {
        pq.add(it)

        if (pq.size > 3) {
            pq.poll()
        }
    }

    return pq.peek()
}