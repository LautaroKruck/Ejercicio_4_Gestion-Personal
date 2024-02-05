class Gerente(nombre: String, edad: Int, salarioBase: Double, override val porcentajeImpuestos: Double = 33.99, private var bonus: Double, var exentoImpuestos: Boolean = false) : Empleado(nombre, edad, salarioBase, porcentajeImpuestos) {
    override fun calcularSalario(): Double {
        if (exentoImpuestos) {
            return salarioBase + bonus
        }
        return super.calcularSalario() + bonus
    }

    override fun toString(): String {
        return super.toString() + ", Bonus: $bonus, Exento de Impuestos: $exentoImpuestos"
    }

    fun administrar(): String {
        return "$nombre está administrando la empresa."
    }
}
