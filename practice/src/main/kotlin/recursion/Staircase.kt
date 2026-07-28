package recursion

fun staircase(n: Int): Unit {
    for (i in 1 .. n) {
        val spaces = " ".repeat(n - i)
        val char = "#".repeat(i)
        println(spaces + char)
    }
}

fun main(args: Array<String>) {
//    val n = readln().trim().toInt()

    staircase(6)
}