package cl.uchile.dcc
package people

import drinks.Glass

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
              val name: String,
              val canMakeCoffee: Boolean = false
            ) {
  override def equals(obj: Any): Boolean = obj match {
    case that: Person =>
      this.getClass == that.getClass &&
        this.name == that.name &&
        this.canMakeCoffee == that.canMakeCoffee
    case _ => false
  }

  override def hashCode(): Int =
    Objects.hash(classOf[Person], name, canMakeCoffee)

  override def toString: String =
    s"Person { name=$name, canMakeCoffee=$canMakeCoffee }"

  def drink(drinkable: Glass) = ???
}
