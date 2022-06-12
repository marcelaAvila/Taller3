import Ejercicio7
fun main(){
    print("Ingresa un numero entero: ")
    var entrada_numero = readLine()!!.toInt()
    var i = 2

    for (i in 2..entrada_numero ) {
        println(" el numero es ${entrada_numero}  primo: ${numeroPrimo(entrada_numero)}")

        entrada_numero--
    }

}

fun numeroPrimo(entrada_numero:Int):Int{
    var resultadoDivisores = Ejercicio7().divisores(entrada_numero)
    var resultadoPrimo= 0

    while(resultadoDivisores == 2 && entrada_numero != 2){

        resultadoPrimo = resultadoDivisores
            resultadoDivisores++
        }
    return resultadoPrimo

}

