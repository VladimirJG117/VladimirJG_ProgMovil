fun main() {
    // Punto 1
    println("Área del rectángulo: ${calcularAreaRectangulo(4, 5)}")
    separador()
    // Punto 2
    println("Volumen del prisma rectangular: ${calcularVolumenPrisma(4, 5, 6)}")
    separador()
    // Punto 3
    println("Ingrese la 3er calificación")
    val input = readLine() //el usuario mete la 3er calificación
    val numero = input!!.toInt()
    println("El promedio es: ${calcularPromedio(numero)}")
    separador()
    // Punto 4
    println("El promedio pasando una calificacion es: ${calcularPromedio(4)}")
    println("El promedio pasando dos calificacion es: ${calcularPromedio(6,4)}")
    println("El promedio con 10f es: ${calcularPromedio10fcalificaciones(10f)}")
    separador()
    // Punto 5
    println("Ingrese los 3 lados del triangulo")
    println("Ingrese el 1er lado:")
    val input1 = readLine()
    val l1 = input1!!.toInt()
    println("Ingrese el 2do lado:")
    val input2 = readLine()
    val l2 = input2!!.toInt()
    println("Ingrese el 3er lado:")
    val input3 = readLine()
    val l3 = input3!!.toInt()
    println("Tu triangulo es un: ")
    identificarTriangulo(l1,l2,l3)
    separador()

    // Punto 6
    identificarTipoDato("Hola") // String
    identificarTipoDato(42) // Int
    identificarTipoDato(3.14) // Double
    identificarTipoDato(true) // Otro
    separador()

    // Punto 7
    val nombres = listOf(
        "Pedro","Luis", "Juan","Manuel", "Juan","Luis", "María","Inés", "Romeo",
        "Ernesto", "Juan","Pedro", "Ariadna", "Mireya","María", "Ana",  "Sofía", "José",  "Juan"
    )
    val nombreBuscar = "Juan"
    println("Número de repeticiones de '$nombreBuscar': ${contarRepeticionesNombre(nombres, nombreBuscar)}")
}

// Punto 1
fun calcularAreaRectangulo(base: Int, altura: Int): Int {
    return base * altura
}

// Punto 2
fun calcularVolumenPrisma(base: Int, altura: Int, profundidad: Int): Int {
    val areaBase = calcularAreaRectangulo(base, altura)
    return areaBase * profundidad
}

// Punto 3
fun calcularPromedio(calificacion1: Int, calificacion2: Int = 8, calificacion3: Int=8): Float {
    return (calificacion1 + calificacion2 + calificacion3) / 3f
}
// Punto 4
fun calcularPromedio10fcalificaciones(calificacion1: Float, calificacion2: Int = 8, calificacion3: Int=8): Float {
    return (calificacion1 + calificacion2 + calificacion3)/3f
}
// Punto 5
fun identificarTriangulo(lado1: Int, lado2: Int, lado3: Int) {
    if (lado1 == lado2 && lado2 == lado3) {
        println("Triángulo Equilátero")
    } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
        println("Triángulo Isósceles")
    } else {
        println("Triángulo Escaleno")
    }
}

// Punto 6
fun identificarTipoDato(valor: Any) {
    when (valor) {
        is String -> println("Es un String")
        is Int -> println("Es un Int")
        is Double -> println("Es un Double")
        else -> println("Es otro tipo de dato")
    }
}

// Punto 7
fun contarRepeticionesNombre(nombres: List<String>, nombreBuscar: String): Int {
    return nombres.count { it == nombreBuscar }
}

fun separador(){
    return println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ")
}