package introduccion

/**
 * Desarrollado por Luis Hermenegildo
 *
 * 2. Escriba un bucle for para calcular el producto del código Unicode (método toLong) de todas las letras de la cadena.
 * Por ejemplo, el producto de todas las cadenas en "Hola" es 9415087488L
 **/


object productoUnicode extends App{
  val str: String = "Hola"
  var producto:Long = 1
  for (c <- str) {
    producto = producto * c.toLong
    println(c)
    println(c.toLong)
  }
  println(s"Producto = ${producto}")
}
