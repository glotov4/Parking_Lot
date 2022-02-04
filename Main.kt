package parking
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var spots = MutableList(0) { Spot(true, Car("", "")) }
    while (true) { // create infinite loop for inputs from scanner. We will break it only with "exit" command that causes break
    val input = scanner.nextLine().split(" ").map { it }.toMutableList() // split input and put it in list
    // no spot = can't read commands other than create
    if (spots.size < 1 && input.first() != "create" && input.first() != "exit") {
        println("Sorry, a parking lot has not been created.")
    } else {
        when (input.first()) { // first word should be a command. check what command this is
            "create" -> spots = create(input[1].toInt()) // create *size* - creates a parking lot with N spots
            "park" -> park(spots, input) // park *Plate* *Color* - parks car at first available spot
            "leave" -> leave(spots, input) // leave *spot* takes car from this particular spot
            "status" -> status(spots) // status - outputs data on occupied spots: spot# plate color
            "reg_by_color" -> regByColor(spots, input) // reg_by_color *color* - gives you plates on cars of that color: *plate*, *plate*
            "spot_by_color" -> spotByColor(spots, input) // spot_by_color *color* - gives you spot#'s on cars of that color: *spot*, *spot*
            "spot_by_reg" -> spotByReg(spots, input) // spot_by_color *reg* - gives you spot#'s on cars with that plate: *spot*, *spot*
            "exit" -> break // "exit" command breaks infinite loop
            else -> println("Unknown command")
        }
    }
    }
}

data class Car(val plate: String, val color: String) // Car data class that stores plate & color info

// Spot data class that stores state (is it empty?) and info on object of Car class.
data class Spot(var empty: Boolean, var car: Car)