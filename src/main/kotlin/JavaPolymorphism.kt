open class shapes{
    open fun area(){
        println("This is the area")
    }
}

class circles:shapes(){
    override fun area(){
        println("circle")
    }
}

class triangle:shapes(){
    override fun area(){
        println("triangle")
    }
}

class rectangles:shapes(){
    override fun area(){
        println("rectangle")
    }
}

fun main(){
    var c=circles()
    var t=triangle()
    var r=rectangles()

    c.area()
    t.area()
    r.area()
}