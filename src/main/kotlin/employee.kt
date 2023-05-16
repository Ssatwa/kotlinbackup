fun main(){

    var details="The following is a list of our employees"
    println(details)


    employee("Alex Gathatwa", "Kenyan",false,300000,"Manager",236547)
    employee("Kennedy Kirui", "Kenyan",false,150000,"Director", 236547)
    employee("Grace Omondi", "Kenyan",true, 265400, "Senior Developer",236547)
    employee("Kathy Kaitlin", "American",true, 145000,"Junior Developer",236547)
}
fun employee(name:String, citizenship:String, Disability: Boolean, Salary:Int, Position:String, ID:Int){

    println(name+" "+citizenship+" "+Disability+" "+Salary+" "+Position+" "+ID)
}