fun main() {

    print("¿Cuantos empleados trabajan en la empresa?: ")
    var cantidad = readLine()!!.toInt()
    var i = 1
    while (i <= cantidad){
        print("¿Cuantas horas trabajo?: ")
        var horas = readLine()!!.toInt()
        println("El salario es de: ${salario(horas)}")
        i++
    }
}

fun salario(numeroHoras:Int):Int{
    var salario = when(numeroHoras){
        in 1..34 -> 15000*numeroHoras
        in 35 .. 59 -> (35*15000)+((numeroHoras-35)*18000)
        else -> (35*15000)+(25*18000)+((numeroHoras-60)*25000)
    }
    return salario
}
