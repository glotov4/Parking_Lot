package parking

fun regByColor(spots: MutableList<Spot>, input: MutableList<String>) {
    val output = mutableListOf<String>()
    for (index in spots.indices) {
        if (spots[index].car.color.uppercase() == input[1].uppercase()) {
            output.add(spots[index].car.plate)
        }
    }
    if (output.isEmpty()) {
        println("No cars with color ${input[1].uppercase()} were found.")
    } else {
        println(output.joinToString())

    }
}