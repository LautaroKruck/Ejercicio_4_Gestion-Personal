fun main() {
    val persona = Persona("Juan", 21)
    println(persona)
    println(persona.celebrarCumple())

    val empleado = Empleado("Pablo", 35, 2000.0)
    println(empleado)
    println(empleado.trabajar())
    println(empleado.celebrarCumple())

    val gerente = Gerente("Laura", 47, 3000.0, bonus = 500.0, exentoImpuestos = true)
    println(gerente)
    println(gerente.administrar())
    println(gerente.trabajar())
    println(gerente.celebrarCumple())
}
