package readme

import scala.util.{Failure, Random, Success, Try}

/**
 * Desarrollado por Luis Hermenegildo
 *
*Ejercicio 3:
 *
 *Utilizando el concepto de funciones de orden superior implementa un método que pueda recibir un String,
*ejecutar alguna operación con este String (el consumidor establece el comportamiento) y retornar un String,
*en caso de que la ejecución falle se deberá propagar una custom exception llamada HigherOrderFunctionException.
 **/

object Ejercicio_3 extends App{
  def errorMethod(variable: String): String = throw new RuntimeException("HigherOrderFunctionException")
  def successfulMethod(variable: String): String = s"${variable} + algo"

  def funcionX(f: String => String, v: String) = f(v)

  println(Try(funcionX(errorMethod,"error")))

  println(funcionX(successfulMethod, "Este es mi mensaje"))
}
