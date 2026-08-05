package arrays

/*
 * Kangaroo
 *
 * Two kangaroos jump along a number line toward positive infinity.
 *   - Kangaroo 1 starts at x1 and covers v1 meters per jump.
 *   - Kangaroo 2 starts at x2 and covers v2 meters per jump.
 *
 * After n jumps they are at x1 + n*v1 and x2 + n*v2. They land on the same
 * spot when x1 + n*v1 == x2 + n*v2, i.e. n*(v1 - v2) == x2 - x1.
 *
 * So a meeting exists iff v1 != v2 and (x2 - x1) is evenly divisible by
 * (v1 - v2) with a non-negative quotient (jumps can't be negative). When
 * v1 == v2 they only ever coincide if they already start together.
 *
 * Example: x1 = 0, v1 = 3, x2 = 4, v2 = 2
 *   n = (4 - 0) / (3 - 2) = 4 -> both reach 12 after 4 jumps -> "YES"
 */
fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    if (v1 == v2) return if (x1 == x2) "YES" else "NO"

    val gap = x2 - x1
    val closingSpeed = v1 - v2

    return if (gap % closingSpeed == 0 && gap / closingSpeed >= 0) "YES" else "NO"
}

fun main() {
    println(kangaroo(0, 3, 4, 2)) // YES
    println(kangaroo(0, 2, 5, 3)) // NO
}
