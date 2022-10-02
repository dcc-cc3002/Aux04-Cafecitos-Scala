package cl.uchile.dcc
package ingredients

/** An abstract class to hold common functionality for [[Ingredient]]s.
  *
  * @param content
  *    The content in milliliters.
  * @param ingredientName
  *    The name of the ingredient.
  */
abstract class AbstractIngredient(
    private val content: Int,
    private val ingredientName: String
) extends Ingredient {
  override def toString: String = s"$ingredientName{content=$content}"
}
