
//=======================> primary constructer===========

//class Car(var speed: Int,var color:String){ //Blue Print
//
//    // hard code
//
////    var color="Red"
////    var speed =100
//
//
//    fun drive(){
//
//        println("car is driving at $speed kmph" )
//
//    }
//
//
//
//    fun stop(){
//
//        println("car is stopped" )
//
//    }
//}


//===================secondary stucter ============
class Car(){ //Blue Print

    // hard code

//    var color="Red"
//    var speed =100

    constructor( speed: Int) : this() {

        println("car is driving at $speed kmph" )
    }


    fun drive(){

    }



    fun stop(){

        println("car is stopped" )

    }
}

fun main(){

    val car = Car(speed = 100) // object created



    car.drive()
    car.stop()

}