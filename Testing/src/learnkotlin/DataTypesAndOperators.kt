class DataTypesAndOperators {
}
// datatypes and operators
fun main(){
    var decimalNumber1 = 3.14 // In Kotlin the default value of a decimal number is double
    var decimalNumber2: Float = 10.45F // In Kotlin if we want to declare a floating point number we have to suffix the value with "F"
                                        // (also : Float is not required)
    var decimalNumber3 = 400_000.45231 // This underscore is ignored, they're just used for visual clarity
    val thisIsChar: Char // If a variable is declared but a value has not been assigned, then we must explcitly declare it's type
    println(decimalNumber3)

    var a: Int = 5
    var b: Int = 9
    a + b
//In Kotlin, bitwise operators are written in this way:
    a and b
    a or b
    a xor b
    a.inv() // invert
    a.inc() // increment
    a.shl(1) // shift left

    /**
     * More information in Primitives.kt (Just "cmd + click" on any of the operators to direct you there)
     */

}

// var vs val:
//var is just a variable, val is equivalent to "final" from Java.
// Basically "var" values can be modified, "val" values cannot.
// tip: Ctrl + Shift + P on a variable to find its values
