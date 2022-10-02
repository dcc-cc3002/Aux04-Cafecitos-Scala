package cl.uchile.dcc
package people

import people.PersonSpec.{person1, person2, person3}

object PersonSpec {
  private var _person1: Person = _
  private var _person2: Person = _
  private var _person3: Person = _

  def setUp(): Unit = {
    _person1 = new Person("Mario")
    _person2 = new Person("Mario")
    _person3 = new Person("María")
  }

  def person1: Person = _person1

  def person2: Person = _person2

  def person3: Person = _person3
}

class PersonSpec extends AbstractUnitSpec {

  before {
    PersonSpec.setUp()
  }

  test("A Person should be equal to itself") {
    person1 should be theSameInstanceAs (person1)
    person1 should equal(person1)
  }

  test("A person is not equal to one of a different class") {
    person1 should
      not equal (s"Person { name=${person1.name}, canMakeCoffee=${person1.canMakeCoffee} }")
  }

  test("Two people with the same name should be equal") {
    person1 should not be theSameInstanceAs(person2)
    person1 should equal(person2)
  }

  test("Two people with different names should not be equal") {
    person1 should not equal (person3)
  }

  test("Two people with the same name should have the same hash code") {
    person1.hashCode() should equal(person2.hashCode())
  }

  test("Two people with different names should not have the same hash code") {
    person1.hashCode() should not equal (person3.hashCode())
  }

  test("The string representation of a person should be correct") {
    s"$person1" should equal(s"Person { name=Mario, canMakeCoffee=false }")
  }
}
