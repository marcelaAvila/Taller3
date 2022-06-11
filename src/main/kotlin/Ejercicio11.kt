fun main() {
    print("Escriba un numero: ")
    var num = readLine()!!.toInt()
    if (numeroPerfecto(num)){
        print("Es un numero perfecto")
    }else{
        print("No es un numero perfecto")
    }

}

fun numeroPerfecto(num:Int):Boolean{
    var suma = 0
    repeat(num){
        if (num%(it+1)==0 && num!=(it+1)){
            suma+=(it+1)
        }
    }
    return suma == num
}