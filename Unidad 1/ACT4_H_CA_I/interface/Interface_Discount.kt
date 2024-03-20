package Interfaces_Act4

interface Interface_Discount{
    val descuento: Int
    val T_Descuento: Int

    fun OPD(money: Double): Double{
        return if(T_Descuento == 0) {
            (money * (100-descuento))/100
        } else{
            money - descuento
        }
    }
}