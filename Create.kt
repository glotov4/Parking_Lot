package parking

fun create(size: Int): MutableList<Spot> {
    println("Created a parking lot with $size spots.")
    return MutableList(size) { Spot(true, Car("", "")) }
}