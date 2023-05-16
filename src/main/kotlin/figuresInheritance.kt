open class Figure{
    var Start="Start"

    fun Area(){
        println("Area")
    }

    fun Perimeter(){
        println("Perimeter")
    }
    fun draw(){
        println("It is drawn")
    }
}

class Circle:Figure(){
    var radius=7
}

open class Rectangle:Figure(){
    var Width=10
    var Height=14
}

class Square:Rectangle(){

}

fun main(){
    var s=Square()
    println(s.Width)
    println(s.Height)
    s.Perimeter()
    s.Area()
    s.draw()
}
