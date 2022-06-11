fun main() {
    var valor = 1.0
    while (valor>0.0){
        print("Escriba el valor de ventas: ")
        valor = readLine()!!.toDouble()
        if (valor>0.0)
            println("El valor mas la comision es de ${comisionVendedores(valor)+valor}")
    }

}

fun comisionVendedores(valor:Double):Double{
    var comision = when(valor){
        in 1.0 .. 49000.0 -> valor*0.07
        in 50000.0 ..100000.0 -> (valor*0.09)+5000.0
        in 100001.0 ..200000.0 -> (valor*0.11)+10000.0
        in 200001.0 ..500000.0 -> (valor*0.13)+20000.0
        else -> (valor*0.15)+40000.0
    }
    return comision
}