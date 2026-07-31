package arrays/*
 * Merge Sorted Array
 *
 * You are given two integer arrays, both sorted in non-decreasing order:
 *   - nums1 has length m + n. Its first m slots hold real values; the last n
 *     slots are 0 and just reserve room for the merge.
 *   - nums2 has length n and holds n real values.
 *
 * Merge them into a single non-decreasing array, storing the result IN PLACE
 * inside nums1 (nothing is returned).
 *
 * The trick: fill nums1 from the BACK. The last slot is the largest value, and
 * we already know the largest value lives at the end of one of the two arrays.
 * Walking backwards means we never overwrite a nums1 element we still need,
 * because the tail slots we write into are exactly the reserved zeros.
 *
 * Example:
 *   nums1 = [1, 2, 3, 0, 0, 0], m = 3
 *   nums2 = [2, 5, 6],          n = 3
 *   result -> [1, 2, 2, 3, 5, 6]
 */
fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {

    var lastReal1 = m - 1          // index of the last real value in nums1

    var last2 = n - 1              // index of the last value in nums2

    var writeIndex = m + n - 1     // index we are currently filling, from the back

    // Merge while nums2 still has values left to place.
    while (last2 >= 0) {

        // If nums1 still has a real value AND it is the bigger one, take it.
        if (lastReal1 >= 0 && nums1[lastReal1] > nums2[last2]) {
            nums1[writeIndex] = nums1[lastReal1]
            lastReal1--
        } else {
            // Otherwise the nums2 value is the bigger (or nums1 is exhausted).
            nums1[writeIndex] = nums2[last2]
            last2--
        }

        writeIndex--
    }
    // Any leftover nums1 values are already in their correct front positions,
    // so there is nothing more to do.
}

fun merge2(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    // Copy nums2's values into the reserved (zero) slots at the end of nums1.
    for (i in 0 until n) {
        nums1[m + i] = nums2[i]
    }
    // Now nums1 holds all m + n real values; just sort it.
    nums1.sort()
}

fun main() {
    val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
    val m = 3
    val nums2 = intArrayOf(2, 5, 6)
    val n = 3

    merge(nums1, m, nums2, n)

    println(nums1.joinToString(", ", "[", "]"))
}
