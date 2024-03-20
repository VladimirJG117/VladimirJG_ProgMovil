package Class_Act4
import kotlin.time.times




open class Class_National(override val ciudad: String): Class_Reservar() {
    override val pais = "México"

    protected val costos = mapOf(
        "Nezahualcoyotl" to 400,
        "Chalco" to 350,
        "Iztapalacra" to 360,
        "Ecatepec" to 240,
        "Tlanepantla" to 320
    )
//Somos una aerolinea de barrio xd

    override fun Precio(numDias: Int): Double {
        val tarifa = costos[ciudad]
        return if (tarifa == null) 0.0
        else (tarifa * numDias).toDouble()
    }

    override fun C_Precio(numDias: Int) {
        val precio = Precio(numDias)
        if (precio == 0.0) {
            println("I´m sorry, esa ciudad es muy peligrosa")
        } else {
            println("Tu viaje a $ciudad cuesta \$$precio")
        }
    }
}