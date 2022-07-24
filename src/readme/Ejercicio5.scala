package readme
/**
 * Desarrollado por Luis Hermenegildo
 *
 *Ejercicio 5:
Por situaciones que se escapan a nuestro entendimiento ha sucedido una calamidad espacio-temporal y te has convertido
en un estudiante universitario. Te encuentras en la recta final del semestre y recuerdas que tienes un proyecto
pendiente que habías estado posponiendo, los requerimientos son los siguientes:

Se requiere generar Nodos que cuenten con lo siguiente:
Nombre, Descripción;
el acceso a estos datos no puede ser directo ni para lectura ni para escritura.
Las estructuras Nodo deben poder relacionarse entre ellas a través de Aristas las cuales unen dos Nodos,
las Aristas deben poder contener un dato adicional llamado Etiqueta el cual una vez establecido
no puede ser modificado pero sí leído de forma indirecta.

Las estructuras antes creadas (Nodos y Aristas) forman parte de una estructura mayor
(DataStructure) que cuenta con N nodos y aristas, la cual a su vez, deberá contener los siguientes datos
Nombre, Descripción los cuales deberán poder cambiarse en el momento que se requiera.

Por último, existe una estructura mucho mayor (DataStructureForest) que está conformada por N estructuras
(DataStructure) y que cuenta con una propiedad llamada Nombre, la cual una vez establecida no deberá ser
modificada pero sí leida.

Todas las estructuras deberán tener una implementación para poder recuperar su estructura entera como String

Ejercicio: Realiza el modelado y crea las clases, métodos, atributos correspondientes a lo que se te pide
para que la continuidad espacio-temporal sea restablecida.
 * */
class Nodo(nombre:String,descripcion:String) {
  def setNombre(nombre:String): Unit ={

  }

}
