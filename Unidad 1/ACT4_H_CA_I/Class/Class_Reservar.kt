package Class_Act4

abstract class Class_Reservar{

    protected val T_Servicio = "Viaje"
    protected var reservado = false
    protected var Total = 0.0
    abstract val pais: String
    abstract val ciudad: String


    fun reservar(num_Dias: Int) {
        if (reservado) {
            println("""Viaje RESERVADO
            ********   País: $pais
            ********   Ciudad: $ciudad
            ********   Precio: $Total""".trimMargin())
            return
        }

val monto = Precio(num_Dias)
if (monto == 0.0) {
            return
        }
        reservado = true
        Total = monto
        println("""VIAJE REGISTRADO
            ********   País: $pais
            ********   Ciudad: $ciudad
            ********   Precio: $Total""".trimMargin())
    }

    protected abstract fun Precio(numDias: Int): Double
    abstract fun C_Precio(numDias: Int)

}