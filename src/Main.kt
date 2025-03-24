fun main() {
    println("Enter snake length:")

    println("print snake board ")
    println("***.....")
    println("........")
    println("........")
    println("........")

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