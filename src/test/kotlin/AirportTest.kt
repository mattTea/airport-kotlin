import io.mockk.mockk
import org.junit.Assert.assertEquals
import org.junit.Test

class AirportTest {

    private val airport = Airport()
    private val planeMock = mockk<Plane>()

    @Test
    fun `hangar is empty when initialised`() {
        assertEquals(0, airport.hangar.size)
    }

    @Test
    fun `adds plane to hangar when landed`() {
        airport.landPlane(planeMock)
        assertEquals(1, airport.hangar.size)
    }

}