fun main() {
    println("Enter snake length:")

    println("print snake board ")
    println("***.....")
    println("........")
    println("........")
    println("........")

    println("Press g to move forward")
    val key = takeString()
    if (key == "g") {

        println(".***....")
        println("........")
        println("........")
        println("........")
    }
    println("Press g to move forward")
    val key1 = takeString()
    if (key1 == "g") {
        println("..***...")
        println("........")
        println("........")
        println("........")
    }
    println("Press g to move forward")
    val key2 = takeString()
    if (key2 == "g") {
        println("...***.")
        println(".......")
        println(".......")
        println(".......")
    }
    println("Press g to move forward")
    val key3 = takeString()
    if (key3 == "g") {
        println(".....***")
        println("........")
        println("........")
        println("........")
    }

    for (i in 0 until 5) {
        println("Press g to move forward")
        val key = takeString()
        if (key == "g") {

            println("***.....")
            println("........")
            println("........")
            println("........")
        }
    }
}