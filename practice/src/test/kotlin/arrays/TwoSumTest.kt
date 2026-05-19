package arrays

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TwoSumTest {

    @Test
    fun `basic case`() {
        assertEquals(listOf(0, 1), twoSum(intArrayOf(2, 7, 11, 15), 9).toList())
    }

    @Test
    fun `solution not at the start`() {
        assertEquals(listOf(1, 2), twoSum(intArrayOf(3, 2, 4), 6).toList())
    }

    @Test
    fun `duplicate numbers used`() {
        assertEquals(listOf(0, 1), twoSum(intArrayOf(3, 3), 6).toList())
    }

    @Test
    fun `negatives`() {
        assertEquals(listOf(0, 2), twoSum(intArrayOf(-3, 4, 3, 90), 0).toList())
    }
}
