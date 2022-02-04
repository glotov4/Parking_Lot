package parking

fun status(spots: MutableList<Spot>) {
    var count = 0
    for (index in spots.indices) {
        if (!spots[index].empty) { // if this spot isn't empty (it is occupied)
            println("${index + 1} ${spots[index].car.plate} ${spots[index].car.color}")
            count ++
        }
    }
    if (count == 0) println("Parking lot is empty.")
}