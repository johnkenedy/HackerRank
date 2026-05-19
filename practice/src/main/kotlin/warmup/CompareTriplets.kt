package warmup

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    val alice = a.zip(b).count { (x, y) -> x > y }
    val bob = a.zip(b).count { (x, y) -> x < y }

    return arrayOf(alice, bob)
}