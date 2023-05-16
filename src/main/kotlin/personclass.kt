class Persons(var name:String,var job_status:String,var gender:String,var age:Int){

}

fun main(){
    var Person1=Persons("Rita","unemployed","Female",18 )
    var Person2=Persons("David","unemployed","Male",43 )

    println(Person1.name)
    println(Person2.name)
}