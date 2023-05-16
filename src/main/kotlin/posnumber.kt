import java.util.Scanner

fun main() {
    var reader = Scanner(System.`in`)

    println("Enter Num:")
    var Num = reader.nextDouble()
    
    if (Num>0){
        println("It is positive")
    }
    else if (Num<0){
        println("It is negative")
    }
    else{
        println("It is a zero")
    }

}   