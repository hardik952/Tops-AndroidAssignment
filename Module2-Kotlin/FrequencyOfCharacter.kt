package Kotlin_Assignments

//Kotlin Program to Find the Frequency of Character in a String

fun main() {
    print("Enter The String : ")
    var str = readln()
    print("Enter character from given String : ")
    var ch = readln()!!.toCharArray()[0]
    var frequency : Int= 0
    for (element in str) {
        if (ch == element) {
            ++frequency
        }
    }
    println("Frequency of $ch in $str = $frequency")
}
