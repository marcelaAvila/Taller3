fun main() {
    var precio:Double

    print("Cual es el precio del libro: ?")
    precio = readLine()!!.toDouble()

    while(precio>0){
        println("El precio neto del libro es de ${precio_neto(precio)}")
        print("Cual es el precio del libro: ?")
        precio = readLine()!!.toDouble()
    }
}

fun precio_neto(precio_libro:Double):Double=
    when{
        precio_libro < 100000 ->precio_libro*0.12
        else->precio_libro-precio_libro*0.18
    }

