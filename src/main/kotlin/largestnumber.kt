import java.util.Scanner

fun main(){
    var reader=Scanner(System.`in`)

    println("Enter firstnumber:")
    var firstnumber=reader.nextDouble()

    println("Enter secondnumber:")
    var secondnumber=reader.nextDouble()

    println("Enter thirdnumber:")
    var thirdnumber=reader.nextDouble()

    val largenumber = if (firstnumber>secondnumber && firstnumber>thirdnumber){
        firstnumber
    } else if (secondnumber>firstnumber && secondnumber>thirdnumber){
        secondnumber
    }  else{
        thirdnumber
    }

    println("The largest number is $largenumber")
}