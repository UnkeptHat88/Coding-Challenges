package leet_code

import kotlin.math.max
import kotlin.math.min

fun main() {

}

fun containerWithMostWater(height: IntArray): Int {
    var l = 0
    var r = height.size - 1

    var maxArea = 0

    while (l < r) {
        maxArea = max(maxArea, min(height[l], height[r]) * (r - l))

        if (height[l] < height[r]) {
            l++
        } else {
            r--
        }
    }

    return maxArea
}