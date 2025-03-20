fun takeInt(): Int {
    val input = readLine()//this line will stop
    return input?.toIntOrNull() ?: throw IllegalArgumentException("Invalid input. Please enter a valid integer.")
}

fun takeString(): String {
    val input = readLine()
    return input ?: throw IllegalArgumentException("Invalid input. Please enter a valid string.")
}

fun takeDouble(): Double {
    val input = readLine()
    return input?.toDoubleOrNull() ?: throw IllegalArgumentException("Invalid input. Please enter a valid double.")
}

fun takeLong(): Long {
    val input = readLine()
    return input?.toLongOrNull() ?: throw IllegalArgumentException("Invalid input. Please enter a valid long.")
}

fun takeBoolean(): Boolean {
    val input = readLine()
    return input?.toBoolean() ?: throw IllegalArgumentException("Invalid input. Please enter a valid boolean.")
}

fun takeFloat(): Float {
    val input = readLine()
    return input?.toFloatOrNull() ?: throw IllegalArgumentException("Invalid input. Please enter a valid float.")
}

fun takeShort(): Short {
    val input = readLine()
    return input?.toShortOrNull() ?: throw IllegalArgumentException("Invalid input. Please enter a valid short.")
}

fun takeByte(): Byte {
    val input = readLine()
    return input?.toByteOrNull() ?: throw IllegalArgumentException("Invalid input. Please enter a valid byte.")
}

fun takeChar(): Char {
    val input = readLine()
    return input?.first() ?: throw IllegalArgumentException("Invalid input. Please enter a valid char.")
}