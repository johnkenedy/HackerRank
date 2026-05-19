package warmup

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CompareTripletsTest {

    @Test
    fun `alice wins two`() {
        assertEquals(
            listOf(1, 1),
            compareTriplets(arrayOf(5, 6, 7), arrayOf(3, 6, 10)).toList()
        )
    }

    @Test
    fun `sample case from problem`() {
        assertEquals(
            listOf(2, 1),
            compareTriplets(arrayOf(17, 28, 30), arrayOf(99, 16, 8)).toList()
        )
    }

    @Test
    fun `all equal`() {
        assertEquals(
            listOf(0, 0),
            compareTriplets(arrayOf(1, 2, 3), arrayOf(1, 2, 3)).toList()
        )
    }

    @Test
    fun `alice wins all`() {
        assertEquals(
            listOf(3, 0),
            compareTriplets(arrayOf(10, 10, 10), arrayOf(1, 2, 3)).toList()
        )
    }

    @Test
    fun `bob wins all`() {
        assertEquals(
            listOf(0, 3),
            compareTriplets(arrayOf(1, 2, 3), arrayOf(10, 10, 10)).toList()
        )
    }
}
