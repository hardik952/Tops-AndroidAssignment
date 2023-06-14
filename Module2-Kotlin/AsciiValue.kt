package Kotlin_Assignments
//Find ASCII value of a character
fun main() {
    print("Enter the Character : ")
    var ch = readLine()!!.toCharArray()[0]
    print("ASCII Value of your Character $ch = ${ch.toInt()}")
}