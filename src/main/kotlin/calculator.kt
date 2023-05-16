import java.util.Scanner

fun main() {
    var reader = Scanner(System.`in`)

    println("Enter num1:")
    val num1=reader.nextFloat()

    println("Enter operation (+, -, *, /):")
    val operation= readLine()

    println("Enter num2:")
    val num2=reader.nextFloat()


    val result= when (operation){
        "+" -> num1+num2
        "-" -> num1-num2
        "*" -> num1*num2
        "/" -> num1/num2
        else-> "Invalid operation"
    }

    println("Answer: $result")

}
