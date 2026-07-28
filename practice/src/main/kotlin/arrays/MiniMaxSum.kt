package arrays


fun miniMaxSum(arr: Array<Int>): Unit {
    var totalSum = 0L
    var min = arr[0]
    var max = arr[0]

    for (i in arr) {
        totalSum += i
        if (i < min) min = i
        if (i > max) max = i
    }

    print("${totalSum - max} ${totalSum - min}")
}

fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    miniMaxSum(intArrayOf(1,2,3,4).toTypedArray())
}