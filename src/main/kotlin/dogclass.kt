class Dogs(var breed:String,var size:String,var color:String,var age:String){


    fun eat(food:String){
        println(food)
    }
    fun sleep(night:String){
        println(night)
    }
    fun sit(chair:String){
        println(chair)
    }
    fun run(play:String){
        println(play)
    }
}

fun main(){
    var Dog1=Dogs("Neopolitan Mastiff","Large","Black","5 years")

    var Dog2=Dogs("Maltese","Small","White","2 years")

    var Dog3=Dogs("Chow Chow","Medium","Brown","3 years")

    println(Dog1.breed)
    println(Dog2.breed)
    println(Dog3.breed)
}