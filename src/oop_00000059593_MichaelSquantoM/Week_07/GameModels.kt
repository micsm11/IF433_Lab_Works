package oop_00000059593_MichaelSquantoM.Week_07

enum class ItemRarity(val dropChance: Int) {
    COMMON(70),
    UNCOMMON(30),
    RARE(10),
    EPIC(5),
    LEGENDARY(1)
}

data clascreate GameItem data class" GameItem(
    val name: String,
    val damage: Int,
    val rarity: ItemRarity
)