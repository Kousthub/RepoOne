package InterviewPrep

fun main() {
    val testString = "abcdvdcba"
    if(testString != null) {
        twoPointer(testString)
    }
}

fun twoPointer(inputString: String): Boolean {
    var left = 0
    var right = inputString.length - 1
    while(left <= right) {
        val inputStringList = inputString.toList()
        if (inputStringList[left] != inputString[right]) {
            println("false")
            return false
        }
        left = left + 1
        right = right - 1
    }
    println("true")
    return true
}