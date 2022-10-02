package cl.uchile.dcc
package ingredients

/** `Coffee` is a class that represents a type of [[Ingredient]].
  *
  * @param content
  *   the amount of coffee on milliliters
  * @constructor Creates a new `Coffee` with the given content.
  */
class Coffee(content: Int) extends AbstractIngredient(content, "Coffee")
