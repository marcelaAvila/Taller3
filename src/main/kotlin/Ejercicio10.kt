fun main(){
    print("ingreso numero: ")
    val numeroEntero = readLine()!!.toInt()
    println("Los divisores del $numeroEntero son: " + divisoresNumero(numeroEntero).joinToString())
    }

fun divisoresNumero(numeroEntero: Int) : MutableList<Int> {
    val resultadoDivisores = mutableListOf<Int>()
    if (numeroEntero < 1)
        return resultadoDivisores
    (1..numeroEntero / 2)
        .filter { numeroEntero % it == 0 }
        .forEach { resultadoDivisores.add(it) }
    resultadoDivisores.add(numeroEntero)
    return resultadoDivisores
}

