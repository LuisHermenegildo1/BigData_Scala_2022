package introduccion

/**
 * Desarrollado por Luis Hermenegildo
 *
 * 5. Escribe una funcion que reciba una lista de objetos de tipo "Persona" y que al iterar la lista imprima a que tipo de persona
 * corresponde, deben de existir al menos estas tres:
 * Alumno(nombre, edad, materias), Profesor(nombre, edad, departamentoId), Oyente(nombre, edad) y Otro (Director, Suplente).
 *
 **/

class Persona(nombre:String, edad:Int){
  //var _nombre:String
  //var _edad:Int
  //def this(nombre: String, edad:Int) = this(nombre, edad)

  def get_info() = {
    println(s"El nombre es ${nombre} y tengo ${edad} años")
  }
  def getEdad():Int = {
    edad
  }
  def getNombre():String = {
    nombre
  }

  def this(nombre: String) = this(nombre,22)
  def this() = this("Luis",30)

}

class Alumno (nombre:String, edad:Int, materias:String)extends Persona(nombre,edad) {
  def getMaterias():String = {
    materias
  }
  override def get_info() ={
    println(s"Hola mi nombre es ${nombre}  mi ${edad} y mis materias son ${materias} ")
  }

}


class Profesor (nombre:String, edad:Int, departamentoId:Int)extends Persona(nombre,edad) {
  def getDepartamentoId():Int = {
    departamentoId
  }
  override def get_info() ={
    println(s"Hola mi nombre es ${nombre}  mi ${edad} y mi departamento es el ${departamentoId} ")
  }

}

class Oyente (nombre:String, edad:Int)extends Persona(nombre,edad) {

}

object listaClases extends App{

  def getPersonType(listaPersonas: List[Persona]) = {
    for(persona <- listaPersonas){
      println(persona.getClass)
      persona.get_info()
    }
  }

  val persona1 = new Persona("Jose",27)
  //persona1.get_info()

  val persona2 = new Persona("Salvador")
  //persona2.get_info()

  val persona3 = new Persona()
  //persona3.get_info()

  val persona4 = new Alumno("Román", 24, "Matematicas, Español")
  //println(s"${persona4.getMaterias()}")
  //persona4.get_info()

  val persona5 = new Profesor("Roberto", 24,2112)
  //println(s"${persona5.getDepartamentoId()}")
  //persona5.get_info()

  val persona6 = new Oyente("Gerardo", 24)
  //println(s"${persona5.getDepartamentoId()}")
  //persona6.get_info()

  var listaPersonas = List(persona1,persona2,persona3,persona4,persona5,persona6)
  getPersonType(listaPersonas)
}