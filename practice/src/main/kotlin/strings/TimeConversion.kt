package strings

fun timeConversion(s: String): String {
    val hour = s.substring(0, 2).toInt()   // "07" -> 7
    val rest = s.substring(2, 8)           // ":05:45"
    val isPM = s.endsWith("PM")

    val hour24 = when {
        isPM && hour != 12 -> hour + 12    // 1–11 PM: add 12
        !isPM && hour == 12 -> 0           // 12 AM (midnight) -> 00
        else -> hour                       // 12 PM stays 12; 1–11 AM stays
    }

    return "%02d%s".format(hour24, rest)   // %02d keeps the leading zero
}

fun main(args: Array<String>) {
    val result = timeConversion("07:05:45PM")

    println(result)
}