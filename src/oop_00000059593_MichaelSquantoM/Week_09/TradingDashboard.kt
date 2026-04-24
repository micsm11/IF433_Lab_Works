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
}