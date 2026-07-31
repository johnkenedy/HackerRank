/*
 * Apple and Orange
 *
 * Sam's house occupies the inclusive range [houseStart, houseEnd] on the x-axis.
 *   - An apple tree stands at appleTree (to the left of the house).
 *   - An orange tree stands at orangeTree (to the right of the house).
 *
 * When a fruit falls it lands at a distance from its own tree:
 *   - a negative distance means it fell to the tree's left,
 *   - a positive distance means it fell to the tree's right.
 * So an apple lands at (appleTree + distance) and an orange at (orangeTree + distance).
 *
 * Given the fall distances for every apple and every orange, print how many
 * apples and how many oranges land on the house, i.e. within the inclusive range.
 *
 * Example:
 *   houseStart = 7, houseEnd = 11, appleTree = 5, orangeTree = 15
 *   appleDistances  = [-2, 2, 1] -> land at 3, 7, 6  -> only 7 is in [7, 11] -> 1
 *   orangeDistances = [5, -6]    -> land at 20, 9    -> only 9 is in [7, 11] -> 1
 */
fun countApplesAndOranges(
    houseStart: Int,
    houseEnd: Int,
    appleTree: Int,
    orangeTree: Int,
    appleDistances: Array<Int>,
    orangeDistances: Array<Int>
): Unit {

    val applesOnHouse = appleDistances.count { distance ->
            (appleTree + distance) in houseStart..houseEnd
        }

    val orangesOnHouse = orangeDistances.count { distance ->
            (orangeTree + distance) in houseStart..houseEnd
        }

    println(applesOnHouse)

    println(orangesOnHouse)
}

fun main() {
    val houseStart = 7
    val houseEnd = 11
    val appleTree = 5
    val orangeTree = 15
    val appleDistances = arrayOf(-2, 2, 1)
    val orangeDistances = arrayOf(5, -6)

    countApplesAndOranges(houseStart, houseEnd, appleTree, orangeTree, appleDistances, orangeDistances)
}
