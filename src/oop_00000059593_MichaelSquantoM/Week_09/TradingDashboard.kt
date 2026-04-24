package oop_00000059593_MichaelSquantoM.Week_09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 5, 25.0, "OPEN"),
        TradeLog("BTCUSDT", "SHORT", 50, -12.0, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 15, 8.4, "CLOSED"),
        TradeLog("DOGEUSDT", "SHORT", 10, -2.5, "OPEN"),
        TradeLog("BTCUSDT", "LONG", 25, 45.0, "CLOSED")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }

    val winningTrades = closedTrades.filter { it.roe > 0 }

    println("Total Closed Trades: ${closedTrades.size}")
    println("Total Winning Trades: ${winningTrades.size}")
    winningTrades.forEach { println("Win: ${it.pair} | ROE: ${it.roe}%") }

    val losingTrades = closedTrades.filter { it.roe <= 0 }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }

    println("\n=== TOP PERFORMERS ===")
    topPerformersString.forEach { println(it) }

    println("\n=== WORST PERFORMERS ===")
    worstPerformersString.forEach { println(it) }
}