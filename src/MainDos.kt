fun main(){
val name = "Facundo Yañez"
    println(name)

    var number = 458
    var numero = 879

    println("El total de la resta es ${number-numero}")

    val nombre = "Diego Yañez"
    println("Mi nombre es $nombre")

    var a = 10
    var b = 20
    var c = 30

    println("El total es ${a+b+c}")

    var cadena ="Intellj"
    var caracter = 'A'

    println("El Total de caracteres de la palabra Intellj es de ${cadena.count()}")

    var curso :Float = 1.5F
    var decimales :Float = 2.458F

    println(Byte.MAX_VALUE)

    var nombredos = true
    println(nombredos)

    imprimParam("Kotlin SI","Java NO")
}
fun imprimParam(paramUno:String,paramDos:String){
    println("La suma de los caracteres es: ${paramUno.count()+paramDos.count()}")
}

fun obtieneIva():Int{
    return 19
}



