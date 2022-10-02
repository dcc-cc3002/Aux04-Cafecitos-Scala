package cl.uchile.dcc
package people

import drinks.Glass

import cl.uchile.dcc.ingredients.Ingredient

/** This class represents a barista.
  * A barista is a person that can make coffee.
  *
  * @param name  The name of the barista
  * @constructor Creates a new barista
  */
class Barista(name: String) extends Person(name, true) {
  override def toString: String = s"Barista { name=$name }"

  /** Makes a coffee with the given ingredients.
    *
    * @param ingredients The ingredients to make the coffee
    * @return The glass with the coffee
    */
  def makeCoffee(ingredients: List[Ingredient]): Glass = ???
}
