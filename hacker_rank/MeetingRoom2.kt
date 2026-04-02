package hacker_rank

import kotlin.math.max

fun main() {
    println(numberOfMeetingRooms(intArrayOf(1, 10, 7), intArrayOf(4, 15, 10)))
    println(numberOfMeetingRooms(intArrayOf(1, 10, 7), intArrayOf(4, 15, 15)))
}

fun numberOfMeetingRooms(start: IntArray, end: IntArray): Int {
    start.sort()
    end.sort()

    var si = 0
    var ei = 0
    var rooms = 0

    var res = 0

    while(si < start.size) {
        if (start[si] < end[ei]) {
            rooms += 1
            si++
        } else {
            rooms -= 1
            ei++
        }

        res = max(res, rooms)
    }

    return res
}