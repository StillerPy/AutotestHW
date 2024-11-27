const val ERR_TRANSACTION_LIMIT = -1
const val ERR_MONTH_LIMIT = -2
const val ERR_UNKNOWN_CARD = -3


fun calculateCommission(card: String, previousSum: Int, transaction: Int): Int {
    if (previousSum + transaction > 600_000) {
        return ERR_MONTH_LIMIT
    }
    if (transaction > 150_000) {
        return ERR_TRANSACTION_LIMIT
    }
    when (card) {
        "Мир" -> return 0
        "Visa" -> return (transaction * 0.0075).toInt().coerceAtLeast(35)
        "Mastercard" -> {
            if (previousSum + transaction <= 75_000) {
                return 0
            } else {
                return ((transaction - 75_000) * 0.006 + 20).toInt()
            }
        }
        else -> return ERR_UNKNOWN_CARD
    }
}