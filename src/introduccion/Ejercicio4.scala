package introduccion

/**
 * Desarrollado por Luis Hermenegildo
 *
 * 4. Escriba una función llamada minmax (valores: Array [Int]), que devuelve una tupla con de los valores mínimo y máximo en el array
 **/

object ejercicio4 extends App{
  trait minMax[A, B] {
    def apply(lista: A): B
  }

  val tupla = new minMax[Array[Int], (Int,Int)] {
    override def apply(lista: Array[Int]): (Int,Int) = lista.min -> lista.max
  }

  var lista = Array(1,2,3,4,5,6)

  print(s"El valor minimo y máximo de la lista en modo Tupla = ${tupla(lista)}")
}