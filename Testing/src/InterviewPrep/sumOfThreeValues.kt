package InterviewPrep

fun main() {
    val nums = arrayOf(30, 15, 25, 20, 10, 35, 45)
    val target = 115
    val result = twoPointer(nums, target)
    println("The result is: $result")
}
// sorted array 10, 15, 20, 25, 30, 35, 45

fun twoPointer(nums: Array<Int>, target: Int): Boolean {
    nums.sort()
    val lenghtOfArray = nums.size
    var left = 0
    val right = lenghtOfArray - 1
    while (left < right) {
        for (iterator in nums) {
            if(iterator != nums[left] && iterator != nums[right]) {
                var numsl = nums[left]
                var numsi = iterator
                var numr = nums[right]
             var sum = nums[left] + iterator + nums[right]
                if(sum == target) {
                    return true
                }
            }
        }
        left = left + 1
    }
    return false
}
