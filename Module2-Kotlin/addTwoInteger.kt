package Kotlin_Assignments
//Kotlin Program to Add Two Integers

fun main() {
    print("Enter The Number 1 : ")
    var n1= readLine()!!.toInt()
    println(n1)
    print("Enter The Number 2 : ")
    var n2= readLine()!!.toFloat()
    println(n2)
   println("Addition of Two Numbers = ${n1.plus(n2)}")
}

