package parking

fun spotByReg(spots: MutableList<Spot>, input: MutableList<String>) {
    val output = mutableListOf<String>()
    for (index in spots.indices) {
        if (spots[index].car.plate.uppercase() == input[1].uppercase()) {
            output.add((index + 1).toString())
        }
    }
    if (output.isEmpty()) {
        println("No cars with registration number ${input[1]} were found.")
    } else {
        println(output.joinToString())
    }
}