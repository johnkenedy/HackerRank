package strings

fun main() {
    println(longestPalindrome("cbbd"))
}

fun longestPalindrome(s: String): String {

    var biggestPalindrome = ""

    for (i in s.indices) {
        for (j in i .. s.length) {
            val currentString = s.substring(i, j)
            if (currentString.length > biggestPalindrome.length && isPalindrome(currentString)) {
                biggestPalindrome = currentString
            }
        }
    }
    return biggestPalindrome
}

private fun isPalindrome(s: String): Boolean {
    return s == s.reversed()
}
