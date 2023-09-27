package learnkotlin

fun main() {
    val nums = arrayOf(30, 15, 25, 20, 10, 35, 45)
    rangeFor(nums)
}

fun typicalFor(nums: Array<Int>) {
    /**
     * We "cannot" write traditional for loops in kotlin. Instead, they will something like
     */
    for(iterator in nums) {
        print(" " + iterator + " ")
    }
    // O/P:  30  15  25  20  10  35  45
}

fun indexFor(nums: Array<Int>) {
    /**
     * For iterating through an index in the for loop
     */
    for(iterator in nums.indices) {
        print(" " + iterator + " ")
    }
    // O/P : 0  1  2  3  4  5  6
}

fun rangeFor(nums: Array<Int>) {
    /**
     * For iterating through a specific range
     */
    val left = 2
    val right = 5

    for(iterator in nums[left]..nums[right]) {
        print(" " + iterator + " ")
    }
    // O/P :  25  26  27  28  29  30  31  32  33  34  35
    // This works only because 25(nums[left]) is less than 35(nums[right]),
    // so maybe for the range function ".." to work, left value should be smaller than right value
    print("\n")
    for(iterator in left..right) {
        print(" " + iterator + " ")
    }
    // O/P :  2  3  4  5
}