package Kotlin_Assignments

// WAP to find max value using function as express
fun Max(num1:Int,num2:Int): Int
{
    return if(num1>num2) num1
    else num2
}
fun main() {
    print("Enter the Number 1 : ")
    var num1 = readLine()!!.toInt()
    print("Enter the Number 2 : ")
    var num2 = readLine()!!.toInt()
    print("Maximum number from given numbers : ${Max(num1,num2)}")
}