package Class_Act4


class Class_Inter(override val pais: String, override val ciudad: String): Class_Reservar() {
    //Cumplimiento del punto 1) creación de la clase International para viajes internacionales



    protected val impuestos = mapOf(
        "Alemania" to 0.16,
        "Chile" to 0.05,
        "Canadá" to 0.1
    )
    //Cumplimiento del punto 3) mapa de impuestos por país



    protected val tarifas = mapOf(
            "Alemania" to mapOf(
            "Munich" to 980,
            "Berlín" to 820,
            "Francfort" to 850
        ),
            "Chile" to mapOf(
            "Santiago" to 643,
            "Valparaíso" to 721
        ),
            "Canadá" to mapOf(
            "Vancouver" to 620,
            "Ottawa" to 680,
            "Montreal" to 600
        )
    )




    //Cumplimiento del punto 4) Se modificó la funcion de obtener el precio para obtener precio con impuesto incluído
    override fun Precio(numero_Dias: Int): Double {
        val tarifa = tarifas[pais]?.get(ciudad)
        return if (tarifa == null) 0.0
        else (tarifa * numero_Dias) * (1 + impuestos[pais]!!)
    }

    override fun C_Precio(numDias: Int) {
        val precio = Precio(numDias)
        if (precio == 0.0) {
            println("I´m sorry, no hacemos viajes a este país o ciudad.")
        } else {
            println("Tu viaje a $ciudad, $pais cuesta \$$precio")
        }
    }
}