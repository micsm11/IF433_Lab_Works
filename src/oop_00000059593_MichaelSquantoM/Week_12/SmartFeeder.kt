package oop_00000059593_MichaelSquantoM.Week_12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed) throw DispenserJamException()
    if (requestedGram > availableGram) throw FoodEmptyException(requestedGram, availableGram)

}