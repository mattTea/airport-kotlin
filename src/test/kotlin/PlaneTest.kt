import io.mockk.every
import io.mockk.mockk
import org.junit.Assert.*
import org.junit.Test

class PlaneTest {

    private val plane = Plane()
    val airportMock = mockk<Airport>()

    @Test
    fun `isFlying is true when initialised`() {
        assertTrue("plane is flying", plane.isFlying)
    }

    @Test
    fun `land sets isFlying to false`() {
        every { airportMock.landPlane(plane) } returns mutableListOf(plane)
        plane.land(airportMock)
        assertFalse(plane.isFlying)
    }

    @Test
    fun `takeOff sets isFlying to true`() {
        every { airportMock.landPlane(plane) } returns mutableListOf(plane)
        plane.land(airportMock)
        every { airportMock.launchPlane(plane) } returns mutableListOf<Plane>()
        plane.takeOff(airportMock)
    }
}