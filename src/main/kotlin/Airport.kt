class Airport {

    var hangar : MutableList<Plane> = mutableListOf()

    fun landPlane(plane: Plane): Any {
        this.hangar.add(element = plane)
        return this.hangar
    }

    fun launchPlane(plane: Plane): Any {
        this.hangar.remove(element = plane)
        return this.hangar
    }

}