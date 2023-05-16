//parent class
open class Shape{
    open fun draw(){
        println("Drawing")
    }
}

//child class
class rectangle:Shape(){
    override fun draw(){
        println("Draw a rectangle")
    }
}

class square:Shape(){
    override fun draw(){
        println("Draw a square")
    }
}

fun main(){
    var r=rectangle()
    r.draw()

    var s=square()
    s.draw()


}
