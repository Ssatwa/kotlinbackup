import java.util.Scanner

fun main() {
    var reader = Scanner(System.`in`)

    println("Enter Num:")
    var Num = reader.nextInt()

    if ((Num%2)==0){
        println("It is even")
    }
    else{
        println("It is an odd number")
    }

}