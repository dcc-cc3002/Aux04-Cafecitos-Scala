package cl.uchile.dcc
package people

import people.PersonSpec.person1

class BaristaSpec extends AbstractUnitSpec {
  private var barista1: Barista = _
  private var barista2: Barista = _
  private var barista3: Barista = _

  before {
    PersonSpec.setUp()
    barista1 = new Barista("Mario")
    barista2 = new Barista("Mario")
    barista3 = new Barista("María")
  }

  test("Two baristas with the same name should be equal") {
    barista1 should not be theSameInstanceAs(barista2)
    barista1 should equal(barista2)
  }

  test("Two baristas with different names should not be equal") {
    barista1 should not equal (barista3)
  }

  test("A Barista and a Person with the same name should not be equal") {
    //    barista1 should not equal (person1)
  }

  test("The string representation of a barista should be correct") {
    s"$barista1" should equal(s"Barista { name=Mario }")
  }

  test(
    "A Barista and a Person with the same name should not have the same hash code"
  ) {
    barista1.hashCode() should not equal (person1.hashCode())
  }
}
