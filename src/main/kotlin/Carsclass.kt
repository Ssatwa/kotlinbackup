class Car{
   var make:String="Toyota"
   var model:String="Camry"
   var color: String="Black"
   var drivingSpeed=80

   fun drive(){
       println("driving")
   }
   fun turn(){
       println("turning")
   }
   fun stop(){
       println("stopping")
   }
}

fun main(){
    var vehicle= Car()
    vehicle.drive()
    vehicle.turn()
    vehicle.stop()

    print(vehicle.model+" "+vehicle.drivingSpeed)
}