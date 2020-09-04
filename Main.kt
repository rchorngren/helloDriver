fun main() {
    val driver1 =  Driver("Emilia",17)
    val driver2 =  Driver("Niklas", 21)

    val vehicle1 : Vehicle =  Car()
    val vehicle2 : Vehicle  = MilitaryTank()


    vehicle1.drive() // Prints “Car didn’t drive - there’s no driver!”
    vehicle2.drive() // Prints “MilitaryTank didn’t drive - there’s no driver!”

    vehicle1.driver = driver1

    vehicle1.drive() // Prints "Car didn't drive - Emilia is 17, but must be 18 or older to drive"

    vehicle1.driver = driver2
    vehicle2.driver = driver2

    vehicle2.drive() // Prints "MilitaryTank didn't drive - Niklas is 21, but must be 25 or older to drive"

    vehicle2.driver = Driver("TankMan", 300)

    vehicle1.drive() // Prints “Car drove 10 miles - 90 miles to go”
    vehicle2.drive() // Prints “MilitaryTank drove 5 miles - 1995 miles to go”
    vehicle1.drive() // Prints “Car drove 10 miles - 80 miles to go”
    vehicle2.drive() // Prints “MilitaryTank drove 5 miles - 1990 miles to go”

}