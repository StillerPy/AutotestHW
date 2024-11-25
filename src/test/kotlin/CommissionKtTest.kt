import org.junit.Assert.*
import org.junit.Test

class CommissionKtTest {
    @Test
    fun visa() {
        val card = "Visa"
        val previousSum = 0
        val transaction = 1000
        val result = calculateCommission(card, previousSum, transaction)
        assertEquals(35, result)

    }
}