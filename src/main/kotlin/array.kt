fun main(){
    var language= arrayOf("Python","Javascript","Kotlin")

    language[2]="C++"

    val newlanguage=language.plus("laravel")

    for (x in newlanguage){
        println(x)

    }

    val size=language.size
    println(size)

    val newsize=newlanguage.size
    println(newsize)
}