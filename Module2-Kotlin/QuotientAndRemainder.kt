package Kotlin_Assignments
//Kotlin Program to Compute Quotient and Remainder
fun main() {
    print("Enter The Dividend : ")
    var dividend = readLine()!!.toInt()
    print("Enter The Divisior : ")
    var divisor = readLine()!!.toInt()
    println("Quotient = $dividend / $divisor = ${dividend.div(divisor)}")
    println("Remainder = $dividend % $divisor = ${dividend.mod(divisor)}")
}
