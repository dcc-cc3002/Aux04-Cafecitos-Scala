package cl.uchile.dcc
package ingredients

/** `Milk` is a class that represents a type of [[Ingredient]].
  *
  * @param content
  *   the amount of milk on milliliters
  * @constructor Creates a new `Milk` with the given content.
  */
class Milk(content: Int) extends AbstractIngredient(content, "Milk")
