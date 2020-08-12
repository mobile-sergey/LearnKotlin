fun main(args: Array<String>) {
    val str = "May the force \nbe with \ryou"
    println(str)

    val str1 = "My dad said\t the funniest\b\b thing he said\"A joke\""
    println(str1)

    val rawCrawl = """|A long time ago,
        |in a galaxy
        |far, far, away...
        |BUM BUMMM BUMMMM""".trimMargin()
    println(rawCrawl)

    val raw2 = """>A long time ago,
        >in a galaxy
        >far, far, away...
        >BUM BUMMM BUMMMM""".trimMargin(">")
    println(raw2)

//    for (char in str) {
//        println(char)
//    }

    val isEqual = str.contentEquals("May the force \nbe with \ryou")
    println(isEqual)

    val contains = str.contains("force")
    println(contains)

    val upper = str.toUpperCase()
    val lower = str.toLowerCase()

    println(upper)
    println(lower)

    val num = 6
    val stringNum = num.toString()
    println(stringNum)

    val sub = str.subSequence(4, 13)
    println(sub)

    val luke = "Luke Skywalker"
    val color = "green"
    val vehicle = "landspeeder"
    val age = 27

    println("$luke has a $color lightsaber and drives a $vehicle and is $age years old")
    println("Lukes full name ${luke.toUpperCase()} has ${luke.length} characters")
}