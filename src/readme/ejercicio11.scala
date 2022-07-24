package readme

/**
 * Desarrollado por Luis Hermenegildo
 *
Ejercicio 11:

Implementar la clase llamada Hexadecimal, la cual deberá sobrecargar las operaciones de suma y resta.
Es necesario que el método getStringHexa retorne como String la representación hexadecimal de la operación.

Ejemplo:

A(Hexa) + 11 (decimal) => 1b (Hexa)
5(decimal) + 6 (decimal) => b (Hexa)
5(Hexa) + 6 (Hexa) => b (Hexa)

Crea la clase Hexadecimal extendiendo de HexaTrait.

Ejemplo de uso de la clase:

val hexaA = new Hexadecimal(10)
val hexaB = new Hexadecimal(11)

assert((hexaA + 4).getStringHexa().equals("e"))
assert((hexaA - 5).getStringHexa().equals("5"))

assert((hexaB + hexaA).getStringHexa().equals("15"))
assert((hexaB - hexaA).getStringHexa().equals("1"))

assert((6 + 10).getStringHexa().equals("10"))
assert((20 - 5).getStringHexa().equals("f"))

HINT: Recuerde considerar los siguientes casos:

Decimal op Decimal
Decimal op Hexadecimal
Hexadecimal op Decimal
Hexadecimal op Hexadecimal
 *
 **/

trait HexaTrait {
  def +(obj:Hexadecimal): Int
  def +(obj:Int): Int
  def -(obj:Hexadecimal): Int
  def -(obj:Int): Int
}

class Hexadecimal(valor:String) extends HexaTrait {
  override def +(that:Hexadecimal):Int ={
    getHexa_to_Decimal() + that.getHexa_to_Decimal()
  }
  override def +(x:Int):Int ={
    getHexa_to_Decimal() + x
  }
  override def -(that:Hexadecimal):Int ={
    getHexa_to_Decimal() - that.getHexa_to_Decimal()
  }
  override def -(x:Int):Int ={
    getHexa_to_Decimal() - x
  }
  def getHexa_to_Decimal():Int={
    Integer.parseInt(valor, 16)
  }
  def getValue():String ={
    valor
  }
}


object ejercicio_11 extends App{
  import OperadoresInt._

  val hexaA = new Hexadecimal("10")
  val hexaB = new Hexadecimal("11")

  //println(10 + hexaA )
  println("===================")
  println("hexaA + 4 = "+ (hexaA + 4))
  println("(hexaA + 4).getStringHexa() = " + (hexaA + 4).getStringHexa())
  println("(hexaA + 4).getStringHexa().equals(\"e\") = " + (hexaA + 4).getStringHexa().equals("e"))
  println("===================")

  println("===================")
  println("hexaA - 5 = "+ (hexaA - 5))
  println("(hexaA - 5).getStringHexa() = " + (hexaA - 5).getStringHexa())
  println("(hexaA - 5).getStringHexa().equals(\"e\") = " + (hexaA - 5).getStringHexa().equals("e"))
  println("===================")
  //assert((hexaA + 4).getStringHexa().equals("e"))
  //assert((hexaA - 5).getStringHexa().equals("5"))

  println("===================")
  println("(hexaB + hexaA) = "+ (hexaB + hexaA))
  println("(hexaB + hexaA).getStringHexa() = " + (hexaB + hexaA).getStringHexa())
  println("(hexaB + hexaA).getStringHexa().equals(\"15\") = " + (hexaB + hexaA).getStringHexa().equals("15"))
  println("===================")

  println("===================")
  println("(hexaB - hexaA) = "+ (hexaB - hexaA))
  println("(hexaB - hexaA).getStringHexa() = " + (hexaB - hexaA).getStringHexa())
  println("(hexaB - hexaA).getStringHexa().equals(\"1\") = " + (hexaB - hexaA).getStringHexa().equals("1"))
  println("===================")
  //assert((hexaB + hexaA).getStringHexa().equals("15"))
  //assert((hexaB - hexaA).getStringHexa().equals("1"))

  println("===================")
  println("(6 + 10) = "+ (6 + 10))
  println("(6 + 10).getStringHexa() = " + (6 + 10).getStringHexa())
  println("(6 + 10).getStringHexa().equals(\"10\") = " + (6 + 10).getStringHexa().equals("10"))
  println("===================")

  println("===================")
  println("(20 + 5) = "+ (20 - 5))
  println("(20 + 5).getStringHexa() = " + (20 - 5).getStringHexa())
  println("(20 - 5).getStringHexa().equals(\"f\") = " + (20 - 5).getStringHexa().equals("f"))
  println("===================")
  //assert((6 + 10).getStringHexa().equals("10"))
  //assert((20 - 5).getStringHexa().equals("f"))

}


package object OperadoresInt {
   implicit class OperadoresInt(val value: Int) extends AnyVal {
      def +(a:Hexadecimal): Int = value + a.getHexa_to_Decimal()
      def -(a:Hexadecimal): Int = value - a.getHexa_to_Decimal()
      def getStringHexa(): String = value.toHexString
  }

}