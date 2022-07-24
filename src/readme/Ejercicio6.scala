package readme
  /**
   * Desarrollado por Luis Hermenegildo
   *
   *Ejercicio 6:
Una famosa empresa de desarrollo de software tiene una biblioteca heredada que cuenta con las siguientes definiciones:

case class Catalog(index: Int, value: String)
case class Address(index: Int, street: String, name: String)
case class Product(index: Int, name: String, tax: Double)

Actualmente se encuentran en un conflicto ya que requieren convertir variables de tipo Int a cualquiera
de las tres estructuras antes mencionadas pero no pueden realizar métodos independientes para llevar a cabo sus tareas.
Se requiere hacer el casteo directamente en la instancia Int como si de un método nativo se tratara, similar a un 20.toString

Ejercicio.
Ayuda a la empresa a resolver su problemática implementando una solución que permita hacer lo siguiente:
20.toCatalog() => Catalog(20,)
20.toAddress() => Address(20,,)
20.toProduct() = Product(20,,0.0)
20.toCatalog(value) = Catalog(20,value)
20.toAddress(street, name) => Address(20,street,name)
20.toProduct(name, tax) => Product(20,name,tax)
   * */

object ejercicio_6 extends App {
    import TurboInt._
    println(20.to_Catalog())
    println(20.to_Address())
    println(20.to_Product())
    println(20.to_Catalog("value"))
    println(20.to_Address("street","name"))
    println(20.to_Product("street",10.1))
}


package object TurboInt {
  implicit class turboInt(val value: Int) extends AnyVal {
    def to_Catalog(): Catalog = new Catalog(value,"")
    def to_Catalog(valor: String): Catalog = new Catalog(value,valor)
    def to_Address(): Address = new Address(value,"","")
    def to_Address(street:String,name:String): Address = new Address(value,street,name)
    def to_Product(): Product = new Product(value,"",0.0)
    def to_Product(name:String, tax:Double): Product = new Product(value,name,tax)
  }
  case class Catalog(index: Int, value: String)
  case class Address(index: Int, street: String, name: String)
  case class Product(index: Int, name: String, tax: Double)
}

