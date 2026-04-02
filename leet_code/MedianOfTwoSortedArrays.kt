package leet_code

fun main() {
    println(medianOfTwoSortedArrays(intArrayOf(), intArrayOf(1)))
    println(medianOfTwoSortedArrays(intArrayOf(1,3), intArrayOf(2)))
}

fun medianOfTwoSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val n = nums1.size
    val m = nums2.size

    var i = 0
    var j = 0
    var m1 = 0
    var m2 = 0

    for (count in 0 .. (n+m)/2) {
        m2 = m1

        if (i !=n && j != m) {
            m1 = if (nums1[i] > nums2[j]) {
                nums2[j++]
            } else {
                nums1[i++]
            }
        } else if (i < n) {
            m1 = nums1[i++]
        } else if (j < m) {
            m1 = nums2[j++]
        }
    }

    return if ((m+n)%2 == 0) {
        (m1+m2).toDouble() / 2
    } else {
        m1.toDouble()
    }
}