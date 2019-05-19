class Plane {

    var isFlying : Boolean = true

    fun land(airport: Airport): Any {
        airport.landPlane(this)
        this.isFlying = false
        return this
    }

    fun takeOff(airport: Airport): Any {
        airport.launchPlane(this)
        this.isFlying = true
        return this
    }

}