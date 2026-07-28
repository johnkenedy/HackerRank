package arrays

fun birthdayCakeCandles(candles: Array<Int>): Int {
    var count = 0

    candles.sortDescending()

    for (i in candles) {
        if (i == candles[0]) count++
    }

    return count
}

fun main(args: Array<String>) {
    val candlesCount = readLine()!!.trim().toInt()

    val candles = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
}