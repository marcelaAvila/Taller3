fun main() {

    var n:Int
    print("¿Hasta que numero deseas la sumatoria? ")
    n = readLine()!!.toInt()
    var suma = 0
    var i = 1
    repeat(n){
        suma+=i
        println("Intento $i : $suma")
        i++
    }
}

