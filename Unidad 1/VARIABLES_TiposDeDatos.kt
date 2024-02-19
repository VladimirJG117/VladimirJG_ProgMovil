
const val PI = 3.14159
fun main() {
    espacio()
    val numeroDecimal = 10.5
    println("El tipo de dato por defecto para un número decimal es: ${numeroDecimal::class.simpleName}")
    espacio()

    val numeroDecimalc = 10.5f
    println("El numero decimal es: $numeroDecimal")
    println("Ahora convertido el número decimal es tipo: ${numeroDecimalc::class.simpleName}")
    espacio()

    val perimetro = 2 * PI * numeroDecimal
    println("El perímetro del círculo es: $perimetro")

    espacio()
    
    val x1 = 4
    val y1 = 3
    val x2 = -3
    val y2 = -2

    val pendiente = (y2 - y1).toDouble() / (x2 - x1)
    println("La pendiente entre los puntos ($x1, $y1) y ($x2, $y2) es: $pendiente")
}

fun espacio(){
    return println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ")
}