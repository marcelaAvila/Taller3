fun main() {
 var num:Int
 print("Ingrese el numero entero positivo: ")
    num = readLine()!!.toInt()
    for(i in 1..num){
        println("Numero $i su factorial es ${factorial(i)}")
    }
}

fun factorial(num:Int):Int{
    var facto:Int = 1
    for(i in 1..num){
        facto*= i
    }
    return facto
}