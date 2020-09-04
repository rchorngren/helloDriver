 class Car(
        driver : Driver? = null,

) : Vehicle(driver) {
     var distanceToGo : Int = 100
     var distancePerDrive : Int = 10
     var name : String = this.javaClass.simpleName

    override fun drive() {
        when {
            driver == null -> {
                println("$name didn't drive - there's no driver!")
            }
            driver!!.age >= 18 -> {
                distanceToGo -= distancePerDrive
                println("$name drove $distancePerDrive miles - $distanceToGo miles to go")
            }

            else -> {
                println("$name didn't drive - ${driver!!.name} is ${driver!!.age}, but must be 18 or older to drive")
            }
        }
    }
}