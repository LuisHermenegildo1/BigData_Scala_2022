package introduccion

/**
 * Desarrollado por Luis Hermenegildo
 *
 * 1. ¿Cómo obtener el primer y último carácter de la cadena "Hola" en Scala?
**/


object caracteres extends App{
  val str: String = "Hello"

  println(s"Metodo 1: Carácter inicial: ${str.charAt(0)}")
  println(s"Metodo 2: Carácter inicial: ${str.substring(0,1)}")
  println(s"Metodo 1: Carácter final: ${str.substring(str.length()-1, str.length())}")
  println(s"Metodo 2: Carácter final: ${str.charAt(str.length - 1 )}")

}

