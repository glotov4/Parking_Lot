package parking

fun park(spots: MutableList<Spot>, input: MutableList<String>, ) { // park KA-01-HH-9999 White
        for (index in spots.indices) {
            if (!spots.contains(Spot(true, Car("", "")))) { // if there is no empty spots
                println("Sorry, the parking lot is full.")
                break // break the loop because we can't park the car here
            }
            else if (spots[index].empty) { // if this spot is empty
                spots[index].empty = false // set it occupied
                spots[index].car = Car(input[1], input[2]) // put this car in this spot
                println("${input[2]} car parked in spot ${index + 1}.") // $color car parked in spot #
                break // the car is parked - break the loop
            }
        }
    }