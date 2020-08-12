fun main(args: Array<String>) {

    var name: String = "Sergey"
    // name = null
    println(name)

    var nullableName : String? = "Do I really exist?"
    println(nullableName)
    nullableName = null

    // Null Check
    var length = 0
    if (nullableName != null)
    {
        length = nullableName.length
    } else {
        length = -1
    }
    println(length)

    val l = if (nullableName != null) nullableName.length else -1

    // Second method Safe Call Operator ?

    println(nullableName?.length)

    // Third method is Elvis Operator

    val len = nullableName?.length ?: -1
    println(len)

    val noName = nullableName ?: "No one knows me..."
    println(noName)

    // !!
    println(nullableName!!.length)
}