import io.mockk.every
import io.mockk.spyk
import org.junit.Assert.*
import org.junit.Test

class WeatherTest {

    private val weather = spyk<Weather>()

    @Test
    fun `is stormy when isStormy is true`() {
        every { weather.generateStorm() } returns true
        assertTrue(weather.isStormy())
    }
}