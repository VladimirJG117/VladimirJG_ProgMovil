import Class_Act4.Class_National
import Class_Act4.Class_Baja
import Class_Act4.Class_Inter


fun main() {
    println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -")
    val V_National = Class_National("Nezahualcoyotl")
    V_National.C_Precio(10)
    V_National.reservar(10)
    println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -")


    val V_Baja = Class_Baja("Iztapalacra")
    V_Baja.C_Precio(7)
    V_Baja.reservar(7)
    println(V_Baja.cancelar())

    println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -")

    val V_Inter = Class_Inter("Canadá", "Ottawa")
    V_Inter.C_Precio(6)
}