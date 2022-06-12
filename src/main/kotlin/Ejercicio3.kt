fun main(){
    print("Bienvenido! si quieres registrar una venta mayor a 50000 por favor escribe 'si'")
    var continuarEjecutando = readLine()!!.toString()


    while (continuarEjecutando == "si"){
        print("Cual es tu nombre? : ")
        var nombreEmpleado = readLine()!!.toString()
        print("Cual es tu salario mensual?: ")
        var salarioEmpleado = readLine()!!.toDouble()

        print("cual es el valor de la venta: ")
        var valorventa = readLine()!!.toDouble()

        println("La comision de ${nombreEmpleado} es: ${ComisionEmpleado(valorventa)}")
        println("Su nuevo salario es  ${salarioEmpleado + ComisionEmpleado(valorventa)}" )
        print("deseas Registrar otro empleado? (si o no)")
        continuarEjecutando = readLine()!!.toString()
        if (continuarEjecutando == "no"){
            print("Gracias por utilizar nuestro servicio")
        }

    }



}
fun ComisionEmpleado(valorventa:Double):Double{
    var resultadoComision = 0.0

    if(valorventa > 50000){
        resultadoComision = valorventa * 0.15
    }
    return resultadoComision
}



