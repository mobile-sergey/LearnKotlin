fun main(args: Array<String>) {

    val rebels = arrayListOf("Laiah", "Luke", "Han Solo", "Mon Mothma")
    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeed", "Boba Fett" to "Rocket Pack")

    for (rebel in rebels) {
        println("Name: $rebel")
    }

    for ((key, value) in rebelVehicles) {
        println("$key gets around in their $value")
    }

    var x = 10
    while (x > 0) {
        println(x)
        x--
    }

    var y = 0
    while (y <= 10) {
        println(y)
        y++
    }
}