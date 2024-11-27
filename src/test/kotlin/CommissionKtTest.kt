import org.junit.Assert.*
import org.junit.Test

class CommissionKtTest {
    @Test
    fun visa_1() {
        val card = "Visa"
        val previousSum = 0
        val transaction = 10_000
        val result = calculateCommission(card, previousSum, transaction)
        assertEquals(75, result)

    }
    @Test
    fun masterCard_1() {
        val card = "Mastercard"
        val previousSum = 0
        val transaction = 150_000
        val result = calculateCommission(card, previousSum, transaction)
        assertEquals(470, result)
    }
    @Test
    fun masterCard_2() {
        val card = "Mastercard"
        val previousSum = 0
        val transaction = 60_000
        val result = calculateCommission(card, previousSum, transaction)
        assertEquals(0, result)
    }
    @Test
    fun mir_1() {
        val card = "Мир"
        val previousSum = 0
        val transaction = 10_000
        val result = calculateCommission(card, previousSum, transaction)
        assertEquals(0, result)
    }
    @Test
    fun unknownCard() {
        val card = "Unknown"
        val previousSum = 0
        val transaction = 10_000
        val result = calculateCommission(card, previousSum, transaction)
        assertEquals(ERR_UNKNOWN_CARD, result)
    }
    @Test
    fun monthLimit() {
        val card = "Visa"
        val previousSum = 0
        val transaction = 10_000_000
        val result = calculateCommission(card, previousSum, transaction)
        assertEquals(ERR_MONTH_LIMIT, result)
    }
    @Test
    fun transactionLimit() {
        val card = "Visa"
        val previousSum = 0
        val transaction = 200_000
        val result = calculateCommission(card, previousSum, transaction)
        assertEquals(ERR_TRANSACTION_LIMIT, result)
    }

}