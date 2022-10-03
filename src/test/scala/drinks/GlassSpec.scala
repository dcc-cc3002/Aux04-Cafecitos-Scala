package cl.uchile.dcc
package drinks

import ingredients.{Coffee, Ingredient, Milk}

class GlassSpec extends AbstractUnitSpec {
  private var glass1: Glass = _
  private var glass2: Glass = _
  private var ingredients: List[Ingredient] = _

  before {
    glass1 = new Glass()
    ingredients = List(new Coffee(60), new Milk(180))
    glass2 = new Glass(ingredients)
  }

  test("The total content of a glass should be correct") {
    glass1.totalContent should be(0)
    glass2.totalContent should not be (0)
    glass2.totalContent should be(240)
  }

  test("A glass can be emptied") {
    glass2.totalContent should not be (0)
    glass2.emptyContent()
    glass2.totalContent should be(0)
  }
}
