fun main() {

    println("print snake board ")
    println("***.....")
    println("........")
    println("........")
    println("........")
    var position = 0
    for (i in 0 until 5) {

        println("Press g to move forward")
        println(i)
        val key = takeString()
        if (key == "g") {
            if (i == 0) {
                println(".***....")
            }
            if (i == 1) {
                println("..***...")
            }
            if (i == 2) {
                println("...***..")
            }
            if (i==3){
                println("....***.")
            }
            if (i==4){
                println(".....***")
            }
            println("........")
            println("........")
            println("........")
        }
    }
}
