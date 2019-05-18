import org.junit.Assert.*
import org.junit.Test

class PlaneTest {

    private val plane = Plane()

//    As an air traffic controller
//    So I can get passengers to a destination
//    I want to instruct a plane to land at an airport

    @Test
    fun `responds to land function`() {
        assertEquals(plane, plane.land())
    }

    @Test
    fun `isFlying is true when initialised`() {
        assertTrue("plane is flying", plane.isFlying)
    }

//    @Test
//    fun `land() sets isFlying to false`() {
//
//    }
}