package introduccion
/**
 * Desarrollado por Luis Hermenegildo
 *
 * 3. Escriba una función WordCount para contar el número de palabras en la cadena entrante
 **/

object Contador extends App{
  trait wordCount[A, B] {
    def apply(word: A): B
  }
  val contador = new wordCount[String, Int] {
    override def apply(word: String): Int = word.length
  }
  def wordCount2(word:String): Int ={
    word.length
  }
  println(s"La palabra Hola tiene ${contador("Hola")} letras.")
  println(s"La palabra Mundo tiene ${wordCount2("Mundo")} letras.")
}
