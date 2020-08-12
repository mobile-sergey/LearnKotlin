fun main(args: Array<String>) {

    val imperals = listOf("Emperior", "Dart Vader", "Boba Fett", "Tarkin")
    println(imperals)
    println(imperals.sorted())
    println(imperals[2])
    println(imperals.last())
    println(imperals.first())
    println(imperals.contains("Luke"))

    val rebels = arrayListOf("Laiah", "Luke", "Han Solo", "Mon Mothma")
    println(rebels.size)
    rebels.add("Chewbacca")
    println(rebels)
    rebels.add(0, "Lando")
    println(rebels)
    println(rebels.indexOf("Luke"))

    rebels.remove("Han Solo")
    println(rebels)

    val rebelVehiclesMap = mapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeed")
    println(rebelVehiclesMap)
    println(rebelVehiclesMap["Solo"])
    println(rebelVehiclesMap.get("Solo"))
    println(rebelVehiclesMap.getOrDefault("Leiah", "This ship doesnt exist"))
    println(rebelVehiclesMap.values)

    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeed", "Boba Fett" to "Rocket Pack")
    rebelVehicles["Luke"] = "XWing"
    rebelVehicles.put("Leiah", "Tantive IV")
    println(rebelVehicles)
    rebelVehicles.remove("Boba Fett")
    println(rebelVehicles)
    println(rebelVehicles.isEmpty())
    rebelVehicles.clear()
    println(rebelVehicles.isEmpty())
}