fun main(){
    //predefined functions
    println("Hello Gathatwa")

    var squareroot=Math.sqrt(256.0)
    println(squareroot)

    var roundoff=Math.round(34.56)
    println(roundoff)

    var number=Math.ceil(45.67)
    println(number)

    myFun()
    add()
    details(name="Alex", age=54)
}

//user-defined functions
fun myFun(){
    println("Today is Friday")
}

fun add(){
    var num1=10
    var num2=2

    println(num1+num2)
}

fun details(name:String, age:Int){


    println("$name is $age years old")
}