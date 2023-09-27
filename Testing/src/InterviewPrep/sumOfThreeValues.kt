package InterviewPrep

fun main() {
    val nums = arrayOf(30, 15, 25, 20, 10, 35, 45)
    val target = 115
    val result = twoPointerN(nums, target)
    println("The result is: $result")
}
// sorted array 10, 15, 20, 25, 30, 35, 45

fun twoPointerN(nums: Array<Int>, target: Int): Boolean { // --> this method has order of complexity of O(1)
    nums.sort()
    val lengthOfArray = nums.size
    for(iterator in 0..lengthOfArray - 2) {
        var left = iterator + 1
        var right = lengthOfArray - 1
        while(left < right) {
            if (nums[iterator] != nums[left] && nums[iterator] != nums[right]) {
                var sum = nums[iterator] + nums[left] + nums[right]
                if (sum < target) {
                    left++
                } else if (sum > target) {
                    right--
                } else if (sum == target) {
                    return true
                }
            }
        }
    }
    return false
}
