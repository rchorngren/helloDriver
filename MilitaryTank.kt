class MilitaryTank(
        driver : Driver? = null

) : Vehicle (driver) {
    var distanceToGo : Int = 2000
    var distancePerDrive : Int = 5
    var name: String = this.javaClass.simpleName

    override fun drive() {
        when {
            driver == null -> {
                println("$name didn't drive - there's no driver!")
            }
            driver!!.age >= 25 -> {
                distanceToGo -= distancePerDrive
                println("$name drove $distancePerDrive miles - $distanceToGo miles to go")
            }
            else -> {
                println("$name didn't drive - ${driver!!.name} is ${driver!!.age}. but must be 25 or older to drive")
            }
        }
    }
}