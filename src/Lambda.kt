fun main(args: Array<String>) {

    val printMessage = {message: String -> println(message)}

    fun printMessageFun(message: String) {
        println(message)
    }

    printMessage("Hello")
    printMessageFun("Hello")

    val sumA = {x: Int, y: Int -> x + y}
    println(sumA(5, 3))

    val sumB : (Int, Int) -> Int = {x, y -> x + y}

    fun downloadData(url: String, completion: () -> Unit){
        // send a download request
        // we got back data
        // there were no network errors
        completion()
    }

    // call downloadDataFunction
    downloadData("fakeurl.com", {
        println("The code in this block, will only run after the completion()")
    })

    fun downloadCarData(url: String, complection: (Car) -> Unit) {
        // send a download request
        // we got back car data
        val car = Car("Tesla", "Model X", "blue")
        complection(car)
    }

    downloadCarData("fakeurl.com"){car ->
        println(car.color)
        println(car.make)
    }

    downloadCarData("fakeurl.com"){
        println(it.color)
        println(it.make)
    }

    fun downloadTruckData(url: String, complection: (Truck?, Boolean) -> Unit){
        // send a download request
        // we got the results back
        val webRequestSuccess = false
        if (webRequestSuccess) {
            // recieved truck data
            val truck = Truck("Ford", "F-150", 10000)
            complection(truck, true)
        } else {
            complection(null, false)
        }
    }

    downloadTruckData("fakeurl.com ") { truck, success ->
        if (success == true) {
            // do something with our truck
            truck?.tow()
        } else {
            // handle the web request failure
            println("Something went wrong")
        }
    }
}