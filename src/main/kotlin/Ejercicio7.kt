fun main() {
    print("${divisores(36)}")
}

fun divisores(num:Int):Int{
    var divisor = 0
    repeat(num){
        if (num%(it+1)==0){
            divisor++
        }
    }
    return divisor
}