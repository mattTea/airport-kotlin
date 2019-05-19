class Plane {

    var isFlying : Boolean = true

    fun land(airport: Airport): Any {
        airport.landPlane(this)
        this.isFlying = false
        return this
    }

}