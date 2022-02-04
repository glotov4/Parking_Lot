package parking

    fun leave(spots: MutableList<Spot>, input: MutableList<String>, ): Unit {
        val spotNum = input[1].toInt()
        if (spotNum <= spots.size) {
        if (spots[spotNum - 1].empty) { // if the spot is empty
            println("There is no car in spot $spotNum.") // spot # is empty
        } else {
            spots[spotNum - 1] = Spot(true, Car("","")) // set the spot free
            println("Spot $spotNum is free.") // spot # is free
        }
        } else println("Input spot number ($spotNum) is bigger than parking lot size (${spots.size})")
    }