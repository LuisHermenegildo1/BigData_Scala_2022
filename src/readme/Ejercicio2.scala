package readme

/**
 * Desarrollado por Luis Hermenegildo
 *
    Ejercicio 2:
      Una hamburguesería famosa tiene un sistema que le permite establecer un ingrediente principal en un producto
      y generar N subproductos basados en el primero, por ejemplo:

      Establecer el ingrediente carne para una hamburguesa

        Crear una hamburguesa de carne con queso

        Crear una hamburguesa de carne con cebolla

        Crear una hamburguesa de carne con cebolla, queso y pepinillo

      Establecer el ingrediente champiñón para una hamburguesa

        Crear una hamburguesa de champiñones y queso

        Crear una hamburguesa de champiñones, queso y papas

      Ejercicio: Utilizando el concepto de funciones de orden superior implementa un método que dé soporte
      al flujo previamente descrito.

      Nota: Considera los ingredientes con un tipo de dato String
 **/



class Ingrendientes(listaIngredientes:List[String]){
  def setMainIngredient(mainIng: String, i: Int): Iterator[List[String]] ={
    if (i > 0) {
       listaIngredientes.combinations(i).++(setMainIngredient(mainIng, i - 1))
    }else
      listaIngredientes.combinations(i)
  }
}

object ejercicio_2 extends App{

  def getMenu(f: (String,Int) => Iterator[List[String]], v: String, i:Int) = f(v,i)


  var ingredients = List("carne","cebolla","papas","mayonesa","pepinillos")
  var receta = new Ingrendientes(ingredients)
  var mainIngredient= "Tocino"
  val result = getMenu(receta.setMainIngredient,mainIngredient, ingredients.length - 1 )
  println("=========================================")
  println(s"Este es el menu basado en los ingredientes ${ingredients}\nY el ingrediente principal ${mainIngredient}:")
  println("=========================================")
  while (result.hasNext){
    print(mainIngredient + " ")
    result.next().foreach(x => print(x + " "))
    println()
  }
}