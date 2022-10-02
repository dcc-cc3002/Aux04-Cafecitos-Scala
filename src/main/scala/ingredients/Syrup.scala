package cl.uchile.dcc
package ingredients

/** `Syrup` is a class that represents a type of [[Ingredient]].
  *
  * @param content
  *   the amount of syrup on milliliters
  * @constructor Creates a new `Syrup` with the given content.
  */
class Syrup(content: Int) extends AbstractIngredient(content, "Syrup")
