package readme
/**
 * Desarrollado por Luis Hermenegildo
 *
 * Ejercicio 8:
 * Se requiere implementar una función que calcule el peso de una persona dependiendo en qué planeta se encuentre.
 * Recordando que la fórmula es la siguiente P = m x g Donde: P = peso, m = masa, g = aceleración gravitacional
 * La aceleración gravitacional varía dependiendo el planeta, se deberá calcular para los siguientes:
 * Planeta g Mercurio 3.70 Tierra 9.81 Saturno 11.67
 * Utilizando funciones de orden superior obten el peso en cada planeta,
 * solo puedes implementar una sola función para resolver el problema def calcular Peso ...
 * val pesoMercurio = mercurio (70)
 * val pesoTierra = tierra (70)
 * val pesoSaturno = saturno (70)
 **/

object ejercicio_8 extends App{

  val mercurio = (x: Int) => x * 3.70
  val tierra = (x: Int) => x * 9.81
  val saturno = (x: Int) => x * 11.67

  val pesoMercurio = mercurio (70)
  val pesoTierra = tierra (70)
  val pesoSaturno = saturno (70)

  println(s"Peso en Mercurio ${pesoMercurio}")
  println(s"Peso en la Tierra ${pesoTierra}")
  println(s"Peso en Saturno ${pesoSaturno}")
}
