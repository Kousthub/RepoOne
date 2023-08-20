fun main() { // String[] args are optional for kotlin
    // this is a top level function

    // var vs val:
    //var is just a variable, val is equivalent to "final" from Java.
    // Basically "var" values can be modified, "val" values cannot.
    // tip: Ctrl + Shift + P on a variable to find its values

    val declareString: String = "The ':String' is used to declare the datatype of the 'final' variable declareString"
    var placeHolder = "Trying out placeholders" //Kotlin has type inference, so we need not declare type for local variables.
    println("Welcome to Kotlin")
    println(add())
    println("In this line we are trying out placeholders, they can be added to a string using the '$' sign as seen here $placeHolder . " +
            "We can also do this here ${add() + 2}")
}
    // var vs val:
    //var is just a variable, val is equivalent to "final" from Java.
    // Basically "var" values can be modified, "val" values cannot.
    // tip: Ctrl + Shift + P on a variable to find its values

fun add(): Int {
    var a = 10
    var b = 20
    var sum = a + b
    return sum
}