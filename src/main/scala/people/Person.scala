package cl.uchile.dcc
package people

import cl.uchile.dcc.drinks.Glass

import java.util.Objects

/** This class represents a common person.
  *
  * @param name
  *   The name of the person
  * @param canMakeCoffee
  *   Whether the person can make coffee or not
  * @constructor Creates a new person
  */
class Person(
    protected val name: String,
    private val canMakeCoffee: Boolean = false
) {
  override def equals(obj: Any): Boolean = obj match {
    case that: Person =>
      Class[Person] == that.getClass &&
        this.name == that.name &&
        this.canMakeCoffee == that.canMakeCoffee
    case _ => false
  }

  override def hashCode(): Int =
    Objects.hash(Class[Person], name, canMakeCoffee)

  override def toString: String = s"Person { name=$name, canMakeCoffee=$canMakeCoffee }"

  def drink(drinkable: Glass) = ???
}
