import kotlin.random.Random

class Weather {

    fun isStormy(): Boolean {
        return this.generateStorm()
    }

    fun generateStorm(): Boolean {
        return Random.nextInt(0, 10) >= 3
    }
}