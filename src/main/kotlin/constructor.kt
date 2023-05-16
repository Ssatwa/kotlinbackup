class Dog(var name:String,var breed:String,var color:String,var age:Int,var weight:Int){


    fun speak(talk:String){
        println(talk)
    }
}

fun main(){
    var Dog1=Dog("Tito","Chiwawa","Brown",2,8)

    var Dog2=Dog("Bruno","Chiwawa","White",1,6)

    println(Dog1.name)
    println(Dog2.name)
    Dog1.speak("Barking")
    Dog2.speak("Barking")
}