package oops

//Parent class
open class Vehicle {
    fun drive(){
        println("Vehicle chal raha hai!")
    }
}

//Child class
class Car : Vehicle(){
    fun horn(){
        println("Beep beep!")
    }
}

fun main(){
    val myCar = Car()
    myCar.drive()//Output: Vehicle chal raha hai!
    myCar.horn()//Output: Beep beep!
}
