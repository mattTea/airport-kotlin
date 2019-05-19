class Plane {

    var isFlying : Boolean = true

    fun land(airport: Airport): Any {
        return if (!this.isFlying) {
            "Plane has already landed"
        } else {
            airport.landPlane(this)
            this.isFlying = false
            this
        }
    }

    fun takeOff(airport: Airport): Any {
        return if (this.isFlying) {
            "Plane is already flying"
        } else {
            airport.launchPlane(this)
            this.isFlying = true
            this
        }
    }

}