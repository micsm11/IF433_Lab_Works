package oop_00000059593_MichaelSquantoM.Week_07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.SafeZone -> {
            println("Kamu berada di zona aman. Silakan istirahat.")
        }
        is BattleState.MonsterEncounter -> {
            println("Awas! Muncul monster ${event.monsterName}!")
        }
        is BattleState.LootDropped -> {
            val (name, damage, rarity) = event.item
            println("Mendapat loot: $name (Damage: $damage, Rarity: $rarity)")
        }
        is BattleState.GameOver -> {
            println("Game Over! Alasan: ${event.reason}")
        }
    }
}