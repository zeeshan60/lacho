fun main() {
    println("Enter snake length:")
    val length = takeInt()

    if (length == 1) {
        println("*")
    } else if (length == 2) {
        println("**")
    } else if (length == 3) {
        println("***")
    } else if (length == 4) {
        println("****")
    } else if (length == 5) {
        println("*****")
    } else if (length == 6) {
        println("******")
    } else if (length == 7) {
        println("*******")
    } else if (length == 8) {
        println("********")
    } else if (length == 9) {
        println("*********")
    } else if (length == 10) {
        println("**********")
    }
}