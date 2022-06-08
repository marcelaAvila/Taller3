fun main() {
    print("Digite el numero entero positivo: ")
    var n = readLine()!!.toInt()
    var i = 1
    println("LA TABLA DE MULTIPLICAR DE $n")
    repeat(10){
        println("$n x ${it+1} = ${n*(it+1)}")
    }
}