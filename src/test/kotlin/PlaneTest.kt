import io.mockk.every
import io.mockk.mockk
import org.junit.Assert.*
import org.junit.Test

class PlaneTest {

    private val plane = Plane()
    private val airportMock = mockk<Airport>()

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
    fun `takeOff raises error if plane is already flying`() {
        assertEquals("Plane is already flying", plane.takeOff(airportMock))
    }

    @Test
    fun `land raises error if plane is not flying`() {
        every { airportMock.landPlane(plane) } returns mutableListOf(plane)
        plane.land(airportMock)
        assertFalse(plane.isFlying)
        assertEquals("Plane has already landed", plane.land(airportMock))
    }

    @Test
    fun `takeOff sets isFlying to true`() {
        every { airportMock.landPlane(plane) } returns mutableListOf(plane)
        plane.land(airportMock)
        assertFalse(plane.isFlying)
        every { airportMock.launchPlane(plane) } returns mutableListOf<Plane>()
        plane.takeOff(airportMock)
        assertTrue(plane.isFlying)
    }
}