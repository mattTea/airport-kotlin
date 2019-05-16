import org.junit.Assert.assertEquals
import org.junit.Test

class AirportTest {

    private val airport = Airport()

    @Test
    fun `returns 'hello'`() {
        assertEquals("Hello", airport.greeting())
    }

}