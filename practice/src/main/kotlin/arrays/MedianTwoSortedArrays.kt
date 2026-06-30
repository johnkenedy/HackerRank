package arrays

class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        // Always binary-search over the shorter array to keep it O(log(min(m, n))).
        if (nums1.size > nums2.size) return findMedianSortedArrays(nums2, nums1)

        val m = nums1.size
        val n = nums2.size
        val half = (m + n + 1) / 2 // size of the left partition

        var low = 0
        var high = m
        while (low <= high) {
            val i = (low + high) / 2 // elements taken from nums1
            val j = half - i         // elements taken from nums2

            val left1 = if (i == 0) Int.MIN_VALUE else nums1[i - 1]
            val right1 = if (i == m) Int.MAX_VALUE else nums1[i]
            val left2 = if (j == 0) Int.MIN_VALUE else nums2[j - 1]
            val right2 = if (j == n) Int.MAX_VALUE else nums2[j]

            if (left1 <= right2 && left2 <= right1) {
                // Correct partition found.
                return if ((m + n) % 2 == 1) {
                    maxOf(left1, left2).toDouble()
                } else {
                    (maxOf(left1, left2) + minOf(right1, right2)) / 2.0
                }
            } else if (left1 > right2) {
                high = i - 1 // took too many from nums1
            } else {
                low = i + 1  // took too few from nums1
            }
        }

        throw IllegalArgumentException("Input arrays are not sorted")
    }
}