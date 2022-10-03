package cl.uchile.dcc
package drinks

import ingredients.Ingredient

/** Represents a glass with [[Ingredient]]s.
 *
 * @property ingredients The [Ingredient]s in the glass.
 * @property totalContent
 * @param _ingredients The [Ingredient]s in the glass.
 * @constructor Creates a new glass with [Ingredient]s.
 */
class Glass(private var _ingredients: List[Ingredient] = List()) {

  /** Returns a copy of the [[Ingredient]]s in the glass. */
  def ingredients: List[Ingredient] = _ingredients.toList

  /** The total content of the glass in milliliters. */
  def totalContent: Int = _ingredients.map(_.content).sum

  /** Empties the contents of the glass. */
  def emptyContent(): Unit = {
    _ingredients = List()
  }
}
