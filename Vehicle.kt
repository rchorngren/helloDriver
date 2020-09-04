open class Vehicle(
        var driver: Driver?

)  {
    open fun drive() {
        //Never really used but needed for override in Car and MilitaryTank class
        println("Please specify the vehicle you're trying to drive")
    }
}
