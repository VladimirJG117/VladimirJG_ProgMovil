package Class_Act4

import Interfaces_Act4.Interface_Cancel
import Interfaces_Act4.Interface_Discount

//Cumplimiento del punto 5) implementacion de la interfaz para cencelar viajes

class Class_Baja(ciudad: String) : Class_National(ciudad), Interface_Discount, Interface_Cancel {

    override val descuento = 10
    override val T_Descuento = 0

    override fun Precio(numDias: Int): Double {
        val monto = super.Precio(numDias)
        return if (monto == 0.0) 0.0 else OPD(monto).toDouble()
    }

    override fun cancelar(): String {

        if (!reservado) {
            return "No hay reservas para cancelar."
        }

        reservado = false
        Total = 0.0
        return "Viaje cancelado"
    }
}
