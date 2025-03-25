fun main() {

    println("print snake board ")
    println("***.....")
    println("........")
    println("........")
    println("........")
    var position = 0
    for (i in 0 until 5) {

            println("Press g to move forward")
            val key = takeString()
            if (key == "g") {

                print(".")
                print("*")
                print("*")
                print("*")
                print(".")
                print(".")
                print(".")
                print(".")
                println()
                println("........")
                println("........")
                println("........")
            }
        }
    }
