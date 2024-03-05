class Vehiculo(
    val color: String,
    val marca: String,
    val modelo: String,
    val placas: String,
    var encendido: Boolean = false,
    var gasolina: Double
) {
    fun encender() {
        if (!encendido) {
            println("El vehículo se ha encendido.")
            encendido = true
        } else {
            println("El vehículo ya está encendido.")
        }
    }

    fun apagar() {
        if (encendido) {
            println("El vehículo se ha apagado.")
            encendido = false
        } else {
            println("El vehículo ya está apagado.")
        }
    }

    fun recargar(cantidad: Double) {
        if (cantidad > 0) {
            println("Recargando $cantidad litros de gasolina.")
            gasolina += cantidad
        } else {
            println("La cantidad de gasolina a recargar debe ser mayor que 0.")
        }
    }
}

class Person constructor(
    val nombre: String,
    val apellidos: String,
    val sexo: String,
    val altura: Double
) {

    fun mostrarInformacion() {
        println("Nombre: $nombre")
        println("Apellidos: $apellidos")
        println("Sexo: $sexo")
        println("Altura: $altura metros")
    }
}

fun main(){
    val miAuto = Vehiculo(color = "Rojo", marca = "Toyota", modelo = "Corolla", placas = "ABC123", gasolina = 50.0)

    miAuto.encender()
    miAuto.encender()

    println("Nivel de gasolina actual: ${miAuto.gasolina} litros")
    miAuto.recargar(20.0)
    println("Nivel de gasolina actual: ${miAuto.gasolina} litros")

    val persona1 = Person(nombre = "Juan", apellidos = "Pérez", sexo = "Masculino", altura = 1.75)
    persona1.mostrarInformacion()
}







