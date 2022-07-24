package readme

/**
 * Desarrollado por Luis Hermenegildo
 *
Ejercicio 10:
Escribe una función que reciba un número entero y retorne su representación en binario, octal y Hexadecimal,
también es necesario que pueda retornar el valor concatenado de los posibles tres valores.
Notas: En caso de que no se envíe una de las cuatro posibles opciones(BINARY, OCTAL, HEXADECIMAL, ALL)
se deberá lanzar una excepción de tipo ConvertException No hacer uso de if else Completa la siguiente función:
def convertDecimalTo( convertTo: String, value: Int ) : String
 *
 **/

object ejercicio_10 extends App{
  def convertDecimalTo( convertTo: String, value: Int ) : String ={
    convertTo match {
      case "BINARY" => value.toBinaryString
      case "OCTAL" => value.toOctalString
      case "HEXADECIMAL" => value.toHexString
      case "ALL" => value.toBinaryString + value.toOctalString + value.toHexString
    }
  }

  println(convertDecimalTo("BINARY",7))
  println(convertDecimalTo("OCTAL",7))
  println(convertDecimalTo("HEXADECIMAL",7))
  println(convertDecimalTo("ALL",7))

}
